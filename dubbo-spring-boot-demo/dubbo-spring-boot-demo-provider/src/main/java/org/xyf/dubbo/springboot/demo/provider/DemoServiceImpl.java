package org.xyf.dubbo.springboot.demo.provider;

import org.apache.dubbo.config.annotation.DubboService;
import org.xyf.dubbo.springboot.demo.DemoService;

@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "hello," + name;
    }
}
