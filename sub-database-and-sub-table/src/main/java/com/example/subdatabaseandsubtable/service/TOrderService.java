package com.example.subdatabaseandsubtable.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.subdatabaseandsubtable.domain.TOrder;

public interface TOrderService extends IService<TOrder> {

    void truncateData();

}
