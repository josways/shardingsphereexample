package com.example.subdatabase.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.subdatabase.domain.TOrderItem;
import org.apache.ibatis.annotations.Update;

public interface TOrderItemMapper extends BaseMapper<TOrderItem> {

    @Update("truncate table t_order_item")
    void truncateData();

}