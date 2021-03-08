package com.example.subdatabase.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.subdatabase.domain.TOrderItem;
import com.example.subdatabase.mapper.TOrderItemMapper;
import com.example.subdatabase.service.TOrderItemService;
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
