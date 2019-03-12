package com.funtl.alibaba.dubbo.consumer.service;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarServiceImpl implements BarService {
    @Override
    public String bar() {
        return "Bar Spring Cloud Alibaba Dubbo";
    }
}
