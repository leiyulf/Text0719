package com.example.test0718.service.impl;


import com.example.test0718.domain.userinfo;
import com.example.test0718.mapper.TestMapper;
import com.example.test0718.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TestService")
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<userinfo> getUserList() {
        return testMapper.getUserList();
    }
}
