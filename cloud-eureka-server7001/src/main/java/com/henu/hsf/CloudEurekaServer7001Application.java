package com.henu.hsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author hsf
 * @version 1.0.0
 * @ClassName CloudEurekaServer7001Application.java
 * @Description TODO
 * @createTime 2021年10月27日 16:48:00
 */
@SpringBootApplication
@EnableEurekaServer // 设置为服务注册中心 EurekaServer
public class CloudEurekaServer7001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001Application.class, args);
        System.out.println("启动成功");
    }
}
