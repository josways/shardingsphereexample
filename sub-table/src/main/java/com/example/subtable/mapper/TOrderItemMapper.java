package com.example.subtable.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.subtable.domain.TOrderItem;
import org.apache.ibatis.annotations.Update;

public interface TOrderItemMapper extends BaseMapper<TOrderItem> {

    @Update("truncate table t_order_item")
    void truncateData();

}