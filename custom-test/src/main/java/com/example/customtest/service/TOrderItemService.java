package com.example.customtest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.customtest.domain.TOrderItem;

public interface TOrderItemService extends IService<TOrderItem> {

    void truncateData();

}
