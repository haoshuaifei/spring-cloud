package com.henu.hsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author hsf
 * @version 1.0.0
 * @ClassName CloudConsumerHystrixDashboard9001Application.java
 * @Description TODO
 * @createTime 2021年11月03日 11:27:00
 */
@SpringBootApplication
@EnableHystrixDashboard
public class CloudConsumerHystrixDashboard9001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerHystrixDashboard9001Application.class, args);
        System.out.println("启动成功");

    }

}
