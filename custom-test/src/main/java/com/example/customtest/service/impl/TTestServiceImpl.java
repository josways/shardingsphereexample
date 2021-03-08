package com.example.customtest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.customtest.domain.TTest;
import com.example.customtest.mapper.TTestMapper;
import com.example.customtest.service.TTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TTestServiceImpl extends ServiceImpl<TTestMapper,TTest> implements TTestService{

    @Autowired
    private TTestMapper tTestMapper;

    @Override
    public void truncateData() {
        tTestMapper.truncateData();
    }
}
