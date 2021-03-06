package com.xiaojiuwo;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class Application {


    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder(Application.class)
                .web(true).run(args);
        //SpringApplication.run(Application.class, args);
    }

}

