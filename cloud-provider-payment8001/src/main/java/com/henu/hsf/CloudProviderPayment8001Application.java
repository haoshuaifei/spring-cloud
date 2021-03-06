package com.henu.hsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hsf
 * @version 1.0.0
 * @ClassName CloudProviderPayment8001Application.java
 * @Description TODO
 * @createTime 2021年10月27日 11:43:00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class CloudProviderPayment8001Application {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderPayment8001Application.class, args);
        System.out.println("启动成功");
    }
}