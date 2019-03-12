package com.funtl.alibaba.dubbo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("consumer")
public interface BarService {
    @GetMapping("/bar")
    String bar();
}
