package com.example.customtest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.customtest.domain.TTest;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TTestMapper extends BaseMapper<TTest> {

    @Update("truncate table t_test")
    void truncateData();

    int batchInsert(@Param("list") List<TTest> list);
}