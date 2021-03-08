package com.example.subtable.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.subtable.domain.TOrder;

public interface TOrderService extends IService<TOrder> {

    void truncateData();

}
