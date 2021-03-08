package com.example.customtest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.customtest.domain.TOrderItem;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface TOrderItemMapper extends BaseMapper<TOrderItem> {

    @Update("truncate table t_order_item")
    void truncateData();

}