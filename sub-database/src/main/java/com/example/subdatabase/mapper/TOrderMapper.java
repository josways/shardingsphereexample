package com.example.subdatabase.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.subdatabase.domain.TOrder;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface TOrderMapper extends BaseMapper<TOrder> {

    @Update("truncate table t_order")
    void truncateData();

}