package com.henu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hsf
 * @version 1.0.0
 * @ClassName MySelfRule.java
 * @Description TODO
 * @createTime 2021年10月27日 17:16:00
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        // 此处将ribbon默认使用的轮询策略改为随机策略
        return new RandomRule();
    }
}
