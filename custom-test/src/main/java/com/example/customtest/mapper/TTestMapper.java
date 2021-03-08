package com.example.customtest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.customtest.domain.TTest;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Repository
public interface TTestMapper extends BaseMapper<TTest> {

    @Update("truncate table t_test")
    void truncateData();

}