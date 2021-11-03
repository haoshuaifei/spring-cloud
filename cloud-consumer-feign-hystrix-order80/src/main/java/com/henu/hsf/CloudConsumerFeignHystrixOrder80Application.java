package com.henu.hsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author hsf
 * @version 1.0.0
 * @ClassName CloudConsumerFeignHystrixOrder80Application.java
 * @Description TODO
 * @createTime 2021年11月01日 14:29:00
 */
@SpringBootApplication
@EnableFeignClients // 启动 feign
@EnableHystrix // 启动 hystrix
public class CloudConsumerFeignHystrixOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerFeignHystrixOrder80Application.class, args);
        System.out.println("启动成功");

    }

}
