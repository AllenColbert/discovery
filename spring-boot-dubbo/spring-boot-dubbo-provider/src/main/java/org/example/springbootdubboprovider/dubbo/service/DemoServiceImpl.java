package org.example.springbootdubboprovider.dubbo.service;


import org.apache.dubbo.config.annotation.DubboService;
import org.example.springbootdubboapi.dubbo.api.DemoService;

@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}