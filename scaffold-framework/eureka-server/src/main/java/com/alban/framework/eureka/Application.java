package com.alban.framework.eureka;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author Alban
 * @Date 2019-05-25
 * @Email: mrfj@live.cn
 * @Description: Eureka Server ,it's for service discovery
 */

@EnableEurekaServer
@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).run(args);
    }

}
