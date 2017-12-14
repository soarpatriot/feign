package com.xiaojiuwo.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by liuhaibao on 2017/12/13.
 */
@FeignClient("client")
public interface HelloService {


    @GetMapping({"/hello"})
    String consumer();
}
