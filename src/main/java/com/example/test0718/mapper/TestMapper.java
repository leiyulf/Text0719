package com.example.test0718.mapper;

import com.example.test0718.domain.userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    List<userinfo> getUserList();
}
