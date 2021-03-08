package com.example.customtest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.customtest.domain.TOrder;

public interface TOrderService extends IService<TOrder> {

    void truncateData();

}
