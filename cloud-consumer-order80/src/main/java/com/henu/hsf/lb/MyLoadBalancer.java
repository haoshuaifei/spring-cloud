package com.henu.hsf.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author hsf
 * @version 1.0.0
 * @ClassName MyLoadBalancer.java
 * @Description TODO
 * @createTime 2021年10月27日 17:18:00
 */
public interface MyLoadBalancer {
    /**
     * 收集服务器总共有多少台能够提供服务的机器，并放到list里面
     *
     * @param serviceInstances
     * @return ServiceInstance
     * @author lixiaolong
     * @date 2020/12/23 9:24
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
