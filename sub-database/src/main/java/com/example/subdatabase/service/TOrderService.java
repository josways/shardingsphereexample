package com.example.subdatabase.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.subdatabase.domain.TOrder;

public interface TOrderService extends IService<TOrder> {

    void truncateData();

}
