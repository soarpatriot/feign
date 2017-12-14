package com.xiaojiuwo.controllers;

import com.xiaojiuwo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liuhaibao on 2017/12/13.
 */

@RestController
@RequestMapping("/test")
public class WorldController {

    @Autowired
    HelloService hello;

    @GetMapping({"","/"})
    public String world() {
        return hello.consumer();
    }


}
