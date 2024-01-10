package org.example.springbootdubboconsumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class SpringBootDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboConsumerApplication.class, args);
    }

}
