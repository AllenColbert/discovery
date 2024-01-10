package org.example.springbootdubboprovider.dubbo.consumer;


import org.apache.dubbo.config.annotation.DubboReference;

import org.example.springbootdubboapi.dubbo.api.DemoService;
import org.example.springbootdubboapi.dubbo.constant.ContentConstant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Consumer implements CommandLineRunner {
    @DubboReference
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {

        String result = demoService.sayHello("world");
        System.out.println("Receive result ======> " + result + ContentConstant.DEMO);
    }
}
