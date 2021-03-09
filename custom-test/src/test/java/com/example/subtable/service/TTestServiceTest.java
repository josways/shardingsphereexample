//package com.example.subtable.service;
//
//import com.example.customtest.CustomTestApplication;
//import com.example.customtest.domain.TTest;
//import com.example.customtest.service.TTestService;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.time.Duration;
//import java.time.Instant;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.concurrent.*;
//
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@SpringBootTest(classes = CustomTestApplication.class)
//public class TTestServiceTest {
//
//    @Autowired
//    private TTestService tTestService;
//
//    public void insert(int threadNumber, int dataSize, boolean isBatch, int batchSize) throws ExecutionException, InterruptedException {
//
//        Instant start = Instant.now();
//
//        int everyDataSize;
//        if (dataSize % threadNumber == 0) {
//            everyDataSize = dataSize / threadNumber;
//        } else {
//            throw new RuntimeException("数据量和线程数不是倍数关系！");
//        }
//        System.out.println(everyDataSize);
//
//        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(threadNumber);
//        final CountDownLatch countDownLatch = new CountDownLatch(threadNumber);
//
//        for (int i = 0; i < threadNumber; i++) {
//            newFixedThreadPool.submit(new Callable<Integer>() {
//                @Override
//                public Integer call() throws Exception {
//                    try {
//                        int sum = 0;
//
//                        if (isBatch) {
//
//                            int loopSize;
//                            if (everyDataSize % batchSize == 0) {
//                                loopSize = everyDataSize / batchSize;
//                            } else {
//                                throw new RuntimeException("数据量和线程数不是倍数关系！");
//                            }
//                            System.out.println(loopSize);
//
//                            for (int j = 0; j < loopSize; j++) {
//                                ArrayList<TTest> tTestArrayList = new ArrayList<>();
//
//                                for (int k = 0; k < batchSize; k++) {
//                                    TTest tTest = new TTest();
//                                    tTest.setColumn1("测试数据" + k);
//                                    tTest.setColumn2("测试数据" + k);
//                                    tTest.setColumn3("测试数据" + k);
//                                    tTest.setColumn4("测试数据" + k);
//                                    tTest.setColumn5("测试数据" + k);
//                                    tTest.setColumn6("测试数据" + k);
//                                    tTest.setColumn7("测试数据" + k);
//                                    tTest.setColumn8("测试数据" + k);
//                                    tTest.setColumn9("测试数据" + k);
//                                    tTest.setColumn10("测试数据" + k);
//                                    tTest.setColumn11("测试数据" + k);
//                                    tTest.setColumn12("测试数据" + k);
//                                    tTest.setColumn13("测试数据" + k);
//                                    tTest.setColumn14("测试数据" + k);
//                                    tTest.setColumn15("测试数据" + k);
//                                    tTest.setColumn16("测试数据" + k);
//                                    tTest.setColumn17("测试数据" + k);
//                                    tTest.setColumn18("测试数据" + k);
//                                    tTest.setColumn19("测试数据" + k);
//                                    tTest.setColumn20("测试数据" + k);
//                                    tTest.setColumn21("测试数据" + k);
//                                    tTest.setColumn22("测试数据" + k);
//                                    tTest.setColumn23("测试数据" + k);
//                                    tTest.setColumn24("测试数据" + k);
//                                    tTest.setColumn25("测试数据" + k);
//                                    tTest.setColumn26("测试数据" + k);
//                                    tTest.setColumn27("测试数据" + k);
//                                    tTest.setColumn28("测试数据" + k);
//                                    tTest.setColumn29("测试数据" + k);
//                                    tTest.setColumn30("测试数据" + k);
//                                    tTest.setColumn31("测试数据" + k);
//                                    tTest.setColumn32("测试数据" + k);
//                                    tTest.setColumn33("测试数据" + k);
//                                    tTest.setColumn34("测试数据" + k);
//                                    tTest.setColumn35("测试数据" + k);
//                                    tTest.setColumn36("测试数据" + k);
//                                    tTest.setColumn37("测试数据" + k);
//                                    tTest.setColumn38("测试数据" + k);
//                                    tTest.setColumn39("测试数据" + k);
//                                    tTest.setColumn40("测试数据" + k);
//                                    tTest.setColumn41("测试数据" + k);
//                                    tTest.setColumn42("测试数据" + k);
//                                    tTest.setColumn43("测试数据" + k);
//                                    tTest.setColumn44("测试数据" + k);
//                                    tTest.setColumn45("测试数据" + k);
//                                    tTest.setColumn46("测试数据" + k);
//                                    tTest.setColumn47("测试数据" + k);
//                                    tTest.setColumn48("测试数据" + k);
//                                    tTest.setColumn49("测试数据" + k);
//                                    tTest.setColumn50("测试数据" + k);
//                                    tTest.setColumn51("测试数据" + k);
//                                    tTest.setColumn52("测试数据" + k);
//                                    tTest.setColumn53("测试数据" + k);
//                                    tTest.setColumn54("测试数据" + k);
//                                    tTest.setColumn55("测试数据" + k);
//                                    tTest.setColumn56("测试数据" + k);
//                                    tTest.setColumn57("测试数据" + k);
//                                    tTest.setColumn58("测试数据" + k);
//                                    tTest.setColumn59("测试数据" + k);
//                                    tTest.setColumn60("测试数据" + k);
//                                    tTest.setColumn61("测试数据" + k);
//                                    tTest.setColumn62("测试数据" + k);
//                                    tTest.setColumn63("测试数据" + k);
//                                    tTest.setColumn64("测试数据" + k);
//                                    tTest.setColumn65("测试数据" + k);
//                                    tTest.setColumn66("测试数据" + k);
//                                    tTest.setColumn67("测试数据" + k);
//                                    tTest.setColumn68("测试数据" + k);
//                                    tTest.setColumn69("测试数据" + k);
//                                    tTest.setColumn70("测试数据" + k);
//                                    tTest.setColumn71("测试数据" + k);
//                                    tTest.setColumn72("测试数据" + k);
//                                    tTest.setColumn73("测试数据" + k);
//                                    tTest.setColumn74("测试数据" + k);
//                                    tTest.setColumn75("测试数据" + k);
//                                    tTest.setColumn76("测试数据" + k);
//                                    tTest.setColumn77("测试数据" + k);
//                                    tTest.setCreateTime(new Date());
//                                    tTest.setUpdateTime(new Date());
//                                    tTestArrayList.add(tTest);
//
//                                    sum++;
//                                }
//                                tTestService.saveBatch(tTestArrayList);
//                            }
//                        } else {
//                            for (int i = 0; i < everyDataSize; i++) {
//                                TTest tTest = new TTest();
//                                tTest.setColumn1("测试数据" + i);
//                                tTest.setColumn2("测试数据" + i);
//                                tTest.setColumn3("测试数据" + i);
//                                tTest.setColumn4("测试数据" + i);
//                                tTest.setColumn5("测试数据" + i);
//                                tTest.setColumn6("测试数据" + i);
//                                tTest.setColumn7("测试数据" + i);
//                                tTest.setColumn8("测试数据" + i);
//                                tTest.setColumn9("测试数据" + i);
//                                tTest.setColumn10("测试数据" + i);
//                                tTest.setColumn11("测试数据" + i);
//                                tTest.setColumn12("测试数据" + i);
//                                tTest.setColumn13("测试数据" + i);
//                                tTest.setColumn14("测试数据" + i);
//                                tTest.setColumn15("测试数据" + i);
//                                tTest.setColumn16("测试数据" + i);
//                                tTest.setColumn17("测试数据" + i);
//                                tTest.setColumn18("测试数据" + i);
//                                tTest.setColumn19("测试数据" + i);
//                                tTest.setColumn20("测试数据" + i);
//                                tTest.setColumn21("测试数据" + i);
//                                tTest.setColumn22("测试数据" + i);
//                                tTest.setColumn23("测试数据" + i);
//                                tTest.setColumn24("测试数据" + i);
//                                tTest.setColumn25("测试数据" + i);
//                                tTest.setColumn26("测试数据" + i);
//                                tTest.setColumn27("测试数据" + i);
//                                tTest.setColumn28("测试数据" + i);
//                                tTest.setColumn29("测试数据" + i);
//                                tTest.setColumn30("测试数据" + i);
//                                tTest.setColumn31("测试数据" + i);
//                                tTest.setColumn32("测试数据" + i);
//                                tTest.setColumn33("测试数据" + i);
//                                tTest.setColumn34("测试数据" + i);
//                                tTest.setColumn35("测试数据" + i);
//                                tTest.setColumn36("测试数据" + i);
//                                tTest.setColumn37("测试数据" + i);
//                                tTest.setColumn38("测试数据" + i);
//                                tTest.setColumn39("测试数据" + i);
//                                tTest.setColumn40("测试数据" + i);
//                                tTest.setColumn41("测试数据" + i);
//                                tTest.setColumn42("测试数据" + i);
//                                tTest.setColumn43("测试数据" + i);
//                                tTest.setColumn44("测试数据" + i);
//                                tTest.setColumn45("测试数据" + i);
//                                tTest.setColumn46("测试数据" + i);
//                                tTest.setColumn47("测试数据" + i);
//                                tTest.setColumn48("测试数据" + i);
//                                tTest.setColumn49("测试数据" + i);
//                                tTest.setColumn50("测试数据" + i);
//                                tTest.setColumn51("测试数据" + i);
//                                tTest.setColumn52("测试数据" + i);
//                                tTest.setColumn53("测试数据" + i);
//                                tTest.setColumn54("测试数据" + i);
//                                tTest.setColumn55("测试数据" + i);
//                                tTest.setColumn56("测试数据" + i);
//                                tTest.setColumn57("测试数据" + i);
//                                tTest.setColumn58("测试数据" + i);
//                                tTest.setColumn59("测试数据" + i);
//                                tTest.setColumn60("测试数据" + i);
//                                tTest.setColumn61("测试数据" + i);
//                                tTest.setColumn62("测试数据" + i);
//                                tTest.setColumn63("测试数据" + i);
//                                tTest.setColumn64("测试数据" + i);
//                                tTest.setColumn65("测试数据" + i);
//                                tTest.setColumn66("测试数据" + i);
//                                tTest.setColumn67("测试数据" + i);
//                                tTest.setColumn68("测试数据" + i);
//                                tTest.setColumn69("测试数据" + i);
//                                tTest.setColumn70("测试数据" + i);
//                                tTest.setColumn71("测试数据" + i);
//                                tTest.setColumn72("测试数据" + i);
//                                tTest.setColumn73("测试数据" + i);
//                                tTest.setColumn74("测试数据" + i);
//                                tTest.setColumn75("测试数据" + i);
//                                tTest.setColumn76("测试数据" + i);
//                                tTest.setColumn77("测试数据" + i);
//                                tTest.setCreateTime(new Date());
//                                tTest.setUpdateTime(new Date());
//                                tTestService.save(tTest);
//
//                                sum++;
//                            }
//                        }
//
//                        return sum;
//                    } finally {
//                        countDownLatch.countDown();
//                    }
//                }
//            });
//
//        }
//
//        System.out.println(newFixedThreadPool);
//        countDownLatch.await();
//        System.out.println(newFixedThreadPool);
//        newFixedThreadPool.shutdown();
//
//        Instant end = Instant.now();
//
//        long millis = Duration.between(start, end).toMillis();
//
//        System.out.println(threadNumber + "线程耗时：" + millis / 1000.0 + " 秒");
//        System.out.println("现在总数量为：" + tTestService.count());
//        tTestService.truncateData();
//
//    }
//
//
////    @Test
////    public void insert1() throws ExecutionException, InterruptedException {
////        insert(1, 1000000, false, 0);
////    }
//
////    @Test
////    public void insert5() throws ExecutionException, InterruptedException {
////        insert(5, 1000000, false, 0);
////    }
////
////    @Test
////    public void insert10() throws ExecutionException, InterruptedException {
////        insert(10, 1000000, false, 0);
////    }
//
//    //    @Test
////    public void insertBatch1() throws ExecutionException, InterruptedException {
////        insert(1, 1000000, true, 1000);
////    }
//
//    @Order(0)
//    @Test
//    public void truncateData() {
//        //截断数据库，预热程序。
//        tTestService.truncateData();
//    }
//
//    @Order(1)
//    @Test
//    public void insertBatch1() throws ExecutionException, InterruptedException {
//        insert(1, 1000000, true, 1000);
//    }
//
//    @Order(2)
//    @Test
//    public void insertBatch2() throws ExecutionException, InterruptedException {
//        insert(2, 1000000, true, 1000);
//    }
//
//    @Order(4)
//    @Test
//    public void insertBatch4() throws ExecutionException, InterruptedException {
//        insert(4, 1000000, true, 1000);
//    }
//
//    @Order(5)
//    @Test
//    public void insertBatch5() throws ExecutionException, InterruptedException {
//        insert(5, 1000000, true, 1000);
//    }
//
//    @Order(10)
//    @Test
//    public void insertBatch10() throws ExecutionException, InterruptedException {
//        insert(10, 1000000, true, 1000);
//    }
//
//    @Order(20)
//    @Test
//    public void insertBatch20() throws ExecutionException, InterruptedException {
//        insert(20, 1000000, true, 1000);
//    }
//
//}
