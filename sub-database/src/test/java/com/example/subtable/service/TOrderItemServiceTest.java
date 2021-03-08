package com.example.subtable.service;

import com.example.subdatabase.SubDatabaseApplication;
import com.example.subdatabase.domain.TOrder;
import com.example.subdatabase.domain.TOrderItem;
import com.example.subdatabase.service.TOrderItemService;
import com.example.subdatabase.service.TOrderService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = SubDatabaseApplication.class)
class TOrderItemServiceTest {

    @Autowired
    private TOrderService tOrderService;

    @Autowired
    private TOrderItemService tOrderItemService;

    public void insert(int threadNumber, int dataSize, boolean isBatch, int batchSize) throws ExecutionException, InterruptedException {

        Instant start = Instant.now();

        int everyDataSize;
        if (dataSize % threadNumber == 0) {
            everyDataSize = dataSize / threadNumber;
        } else {
            throw new RuntimeException("数据量和线程数不是倍数关系！");
        }
        System.out.println(everyDataSize);

        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(threadNumber);

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < threadNumber; i++) {
            Future<Integer> integerFuture = newFixedThreadPool.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int sum = 0;

                    if (isBatch) {

                        int loopSize;
                        if (everyDataSize % batchSize == 0) {
                            loopSize = everyDataSize / batchSize;
                        } else {
                            throw new RuntimeException("数据量和线程数不是倍数关系！");
                        }
                        System.out.println(loopSize);

                        for (int j = 0; j < loopSize; j++) {
                            ArrayList<TOrder> tOrderArrayList = new ArrayList<>();
                            ArrayList<TOrderItem> tOrderItemArrayList = new ArrayList<>();

                            for (int k = 0; k < batchSize; k++) {
                                TOrder tOrder = new TOrder();
                                tOrder.setUserId((long) k);
                                tOrder.setName("测试" + k);
                                tOrderArrayList.add(tOrder);
                            }
                            tOrderService.saveBatch(tOrderArrayList);

                            for (int k = 0; k < tOrderArrayList.size(); k++) {
                                TOrderItem tOrderItem = new TOrderItem();
                                tOrderItem.setOrderId(tOrderArrayList.get(k).getOrderId());
                                tOrderItem.setItem("测试" + k);
                                tOrderItem.setUserId(tOrderArrayList.get(k).getUserId());
                                tOrderItemArrayList.add(tOrderItem);

                                sum++;
                            }
                            tOrderItemService.saveBatch(tOrderItemArrayList);

                        }
                    } else {
                        for (int i = 0; i < everyDataSize; i++) {
                            TOrder tOrder = new TOrder();
                            tOrder.setUserId((long) i);
                            tOrder.setName("测试" + i);
                            tOrderService.save(tOrder);

                            TOrderItem tOrderItem = new TOrderItem();
                            tOrderItem.setOrderId(tOrder.getOrderId());
                            tOrderItem.setItem("测试" + i);
                            tOrderItem.setUserId(tOrder.getUserId());
                            tOrderItemService.save(tOrderItem);

                            sum++;
                        }
                    }

                    return sum;
                }
            });
            Integer integer = integerFuture.get();
            integerArrayList.add(integer);
        }

        for (Integer integer : integerArrayList) {
            System.out.println(integer);
        }

        Instant end = Instant.now();

        long millis = Duration.between(start, end).toMillis();

        System.out.println(threadNumber + "线程耗时：" + millis / 1000.0 + " 秒");

        tOrderItemService.truncateData();
        tOrderService.truncateData();

    }


//    @Test
//    public void insert1() throws ExecutionException, InterruptedException {
//        insert(1, 100000, false, 0);
//    }

//    @Test
//    public void insert5() throws ExecutionException, InterruptedException {
//        insert(5, 100000, false, 0);
//    }
//
//    @Test
//    public void insert10() throws ExecutionException, InterruptedException {
//        insert(10, 100000, false, 0);
//    }

    //    @Test
//    public void insertBatch1() throws ExecutionException, InterruptedException {
//        insert(1, 100000, true, 1000);
//    }

    @Order(0)
    @Test
    public void truncateData() {
        //截断数据库，预热程序。
        tOrderItemService.truncateData();
        tOrderService.truncateData();
    }

    @Order(1)
    @Test
    public void insertBatch1() throws ExecutionException, InterruptedException {
        insert(1, 100000, true, 1000);
    }

    @Order(2)
    @Test
    public void insertBatch2() throws ExecutionException, InterruptedException {
        insert(2, 100000, true, 1000);
    }

    @Order(4)
    @Test
    public void insertBatch4() throws ExecutionException, InterruptedException {
        insert(4, 100000, true, 1000);
    }

    @Order(5)
    @Test
    public void insertBatch5() throws ExecutionException, InterruptedException {
        insert(5, 100000, true, 1000);
    }

    @Order(6)
    @Test
    public void insertBatch6() throws ExecutionException, InterruptedException {
        insert(6, 100000, true, 1000);
    }

    @Order(8)
    @Test
    public void insertBatch8() throws ExecutionException, InterruptedException {
        insert(8, 100000, true, 1000);
    }

    @Order(10)
    @Test
    public void insertBatch10() throws ExecutionException, InterruptedException {
        insert(10, 100000, true, 1000);
    }

    @Order(15)
    @Test
    public void insertBatch15() throws ExecutionException, InterruptedException {
        insert(15, 100000, true, 1000);
    }

    @Order(20)
    @Test
    public void insertBatch20() throws ExecutionException, InterruptedException {
        insert(20, 100000, true, 1000);
    }

    @Order(100)
    @Test
    public void count() {
        int tOrderItemCount = tOrderItemService.count();
        int tOrderCount = tOrderService.count();
        System.out.println("tOrderItemCount: " + tOrderItemCount);
        System.out.println("tOrderCount: " + tOrderCount);
    }

}