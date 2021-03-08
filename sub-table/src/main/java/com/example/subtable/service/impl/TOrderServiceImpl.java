package com.example.subtable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.subtable.domain.TOrder;
import com.example.subtable.mapper.TOrderMapper;
import com.example.subtable.service.TOrderService;
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
