package org.example.springbootdubboconsumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.example.springbootdubboapi.dubbo.api.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : xuyunfeng
 * @date 2024/1/10 16:33
 */

@RestController
@RequestMapping("demo")
public class DemoController {

    @DubboReference
    private DemoService demoService;

    @GetMapping("sayHello")
    public String sayHello(@RequestParam("name")String name){
        return demoService.sayHello(name);
    }


}
