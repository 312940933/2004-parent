package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by 54110 on 2020/10/19.
 */
@SpringBootApplication
//标注当前工程是eureka的客户端
//@EnableEurekaClient
@EnableDiscoveryClient
//标注当前工程开启熔断器
@EnableCircuitBreaker
public class StudentSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentSpringBootApplication.class);
    }
}
