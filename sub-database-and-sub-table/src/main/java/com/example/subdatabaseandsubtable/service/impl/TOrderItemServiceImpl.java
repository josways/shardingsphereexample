package com.example.subdatabaseandsubtable.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.subdatabaseandsubtable.domain.TOrderItem;
import com.example.subdatabaseandsubtable.mapper.TOrderItemMapper;
import com.example.subdatabaseandsubtable.service.TOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TOrderItemServiceImpl
        extends ServiceImpl<TOrderItemMapper, TOrderItem>
        implements TOrderItemService {

    @Autowired
    private TOrderItemMapper tOrderItemMapper;

    @Override
    public void truncateData() {
        tOrderItemMapper.truncateData();
    }

}
