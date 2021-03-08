package com.example.subtable.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.subtable.domain.TOrderItem;

public interface TOrderItemService extends IService<TOrderItem> {

    void truncateData();

}
