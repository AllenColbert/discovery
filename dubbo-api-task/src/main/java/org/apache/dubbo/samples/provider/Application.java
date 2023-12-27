package org.apache.dubbo.samples.provider;


import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;
import org.apache.dubbo.config.bootstrap.DubboBootstrap;
import org.apache.dubbo.samples.api.GreetingsService;

public class Application {

    public static void main(String[] args) {
        ServiceConfig<Object> service = new ServiceConfig<>();

        service.setInterface(GreetingsService.class);
        service.setRef(new GreetingsServiceImpl());
        DubboBootstrap.getInstance()
                .application("first-dubbo-provider")
                .registry(new RegistryConfig("zookeeper://127.0.0.1:2181"))
                .protocol(new ProtocolConfig("dubbo",-1))
                .service(service)
                .start()
                .await();
    }
}
