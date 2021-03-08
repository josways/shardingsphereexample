package com.example.customtest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.customtest.domain.TOrder;
import com.example.customtest.mapper.TOrderMapper;
import com.example.customtest.service.TOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TOrderServiceImpl
        extends ServiceImpl<TOrderMapper, TOrder>
        implements TOrderService {

    @Autowired
    private TOrderMapper tOrderMapper;

    @Override
    public void truncateData() {
        tOrderMapper.truncateData();
    }

}
