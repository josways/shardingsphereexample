package com.example.subdatabase.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.subdatabase.domain.TOrderItem;

public interface TOrderItemService extends IService<TOrderItem> {

    void truncateData();

}
