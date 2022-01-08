package com.example.mockh2test.dao.domain;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface AlertLogMapper extends BaseMapper<AlertLog> {


}

