package com.example.test0718.controller;

import com.example.test0718.domain.userinfo;
import com.example.test0718.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/test/")
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("/getUserInfo")
    @ResponseBody
    public List<userinfo> sendSampleMessage(@RequestBody userinfo query) {
        return testService.getUserList();
    }
}
