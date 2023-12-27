package org.apache.dubbo.samples.provider;

import org.apache.dubbo.samples.api.GreetingsService;

public class GreetingsServiceImpl implements GreetingsService {

    @Override
    public String sayHi(String name) {
        return "hi," + name;
    }
}
