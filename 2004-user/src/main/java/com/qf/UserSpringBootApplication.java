package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by 54110 on 2020/10/19.
 */
@SpringBootApplication
//标注当前工程是eureka的客户端
@EnableEurekaClient
//使用feign远程调用接口
@EnableFeignClients
//标注当前工程开启服务的降级处理
@EnableHystrix
public class UserSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserSpringBootApplication.class);
    }

  /*  @Bean
    //负载均衡
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

}
