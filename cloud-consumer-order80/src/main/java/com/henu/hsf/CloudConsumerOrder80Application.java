package com.henu.hsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author hsf
 * @version 1.0.0
 * @ClassName CloudConsumerOrder80Application.java
 * @Description TODO
 * @createTime 2021年10月27日 15:46:00
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class) // 启动该服务时去加载自定义的ribbon配置
public class CloudConsumerOrder80Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerOrder80Application.class, args);
        System.out.println("启动成功");

    }

}