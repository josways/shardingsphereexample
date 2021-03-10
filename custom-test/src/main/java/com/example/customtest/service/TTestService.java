package com.example.customtest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.customtest.domain.TTest;

import java.util.List;

public interface TTestService extends IService<TTest> {

    void truncateData();

    int batchInsert(List<TTest> tTestList);

}
