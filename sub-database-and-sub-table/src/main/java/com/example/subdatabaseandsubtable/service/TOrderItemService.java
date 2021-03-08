package com.example.subdatabaseandsubtable.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.subdatabaseandsubtable.domain.TOrderItem;

public interface TOrderItemService extends IService<TOrderItem> {

    void truncateData();

}
