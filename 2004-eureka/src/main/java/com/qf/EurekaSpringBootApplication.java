package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 54110 on 2020/10/19.
 */
@SpringBootApplication
//标注当前工程是eureka的服务端
@EnableEurekaServer
public class EurekaSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSpringBootApplication.class);
    }
}
