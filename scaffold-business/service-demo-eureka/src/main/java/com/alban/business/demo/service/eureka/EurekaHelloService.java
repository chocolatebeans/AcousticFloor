package com.alban.business.demo.service.eureka;

import com.netflix.appinfo.EurekaInstanceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Alban
 * @Date 2019-05-28
 * @Email: mrfj@live.cn
 * @Description:
 */
@RestController
public class EurekaHelloService {

    private static final Logger logger = LoggerFactory.getLogger(EurekaHelloService.class);
    @Autowired
    private EurekaInstanceConfig eurekaInstanceConfig;
    @Value("${server.port}")
    private int serverPort;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        logger.info("/hello, instanceId:{}, host:{}", eurekaInstanceConfig.getInstanceId(), eurekaInstanceConfig.getHostName(false));
        return "Hello, Spring Cloud! My port is " + String.valueOf(serverPort);
    }

}
