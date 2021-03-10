package com.example.subtable.service;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import com.example.customtest.CustomTestApplication;
import com.example.customtest.domain.TTest;
import com.example.customtest.service.TTestService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest(classes = CustomTestApplication.class)
public class TTestServiceTest1 {

    @Autowired
    private TTestService tTestService;

    public void insert(int threadNumber, int dataSize, boolean isBatch, int batchSize) throws ExecutionException, InterruptedException {

        Snowflake snowflake = IdUtil.getSnowflake(1, 1);

        Instant start = Instant.now();

        int everyDataSize;
        if (dataSize % threadNumber == 0) {
            everyDataSize = dataSize / threadNumber;
        } else {
            throw new RuntimeException("数据量和线程数不是倍数关系！");
        }
        System.out.println(everyDataSize);

        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(threadNumber);
        final CountDownLatch countDownLatch = new CountDownLatch(threadNumber);

        for (int i = 0; i < threadNumber; i++) {
            newFixedThreadPool.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    try {
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
                                ArrayList<TTest> tTestArrayList = new ArrayList<>();

                                for (int k = 0; k < batchSize; k++) {
                                    TTest tTest = new TTest();
                                    tTest.setTestId(snowflake.nextId());
                                    tTest.setColumn1(k);
                                    tTest.setColumn2("测试数据" + k);
                                    tTest.setCreateTime(new Date());
                                    tTestArrayList.add(tTest);

                                    sum++;
                                }
                                tTestService.batchInsert(tTestArrayList);
                            }
                        } else {
                            for (int i = 0; i < everyDataSize; i++) {
                                TTest tTest = new TTest();
                                tTest.setColumn1(i);
                                tTest.setColumn2("测试数据" + i);
                                tTest.setCreateTime(new Date());
                                tTestService.save(tTest);

                                sum++;
                            }
                        }
                        return sum;
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            });
        }

        System.out.println(newFixedThreadPool);
        countDownLatch.await();
        System.out.println(newFixedThreadPool);
        newFixedThreadPool.shutdown();

        Instant end = Instant.now();

        long millis = Duration.between(start, end).toMillis();

        System.out.println(threadNumber + "线程耗时：" + millis / 1000.0 + " 秒");
        System.out.println("现在总数量为：" + tTestService.count());

        tTestService.truncateData();
    }


//    @Test
//    public void insert1() throws ExecutionException, InterruptedException {
//        insert(1, 10000000, false, 0);
//    }
//    @Test
//    public void insert5() throws ExecutionException, InterruptedException {
//        insert(5, 10000000, false, 0);
//    }
//
//    @Test
//    public void insert10() throws ExecutionException, InterruptedException {
//        insert(10, 10000000, false, 0);
//    }

    @Order(0)
    @Test
    public void truncateData() {
        //截断数据库，预热程序。
        tTestService.truncateData();
    }

//    @Order(1)
//    @Test
//    public void insertBatch1() throws ExecutionException, InterruptedException {
//        insert(1, 10000000, true, 1000);
//    }

//    @Order(2)
//    @Test
//    public void insertBatch2() throws ExecutionException, InterruptedException {
//        insert(2, 10000000, true, 1000);
//    }

//    @Order(4)
//    @Test
//    public void insertBatch4() throws ExecutionException, InterruptedException {
//        insert(4, 10000000, true, 1000);
//    }

    @Order(5)
    @Test
    public void insertBatch5() throws ExecutionException, InterruptedException {
        insert(5, 10000000, true, 1000);
    }

    @Order(10)
    @Test
    public void insertBatch10() throws ExecutionException, InterruptedException {
        insert(10, 10000000, true, 1000);
    }

    @Order(20)
    @Test
    public void insertBatch20() throws ExecutionException, InterruptedException {
        insert(20, 10000000, true, 1000);
    }

}
