package com.example.subdatabase.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.subdatabase.domain.TOrder;
import com.example.subdatabase.mapper.TOrderMapper;
import com.example.subdatabase.service.TOrderService;
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
