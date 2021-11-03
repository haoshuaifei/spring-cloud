package com.henu.hsf.service.impl;

import com.henu.hsf.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @author hsf
 * @version 1.0.0
 * @ClassName PaymentFallbackServiceImpl.java
 * @Description TODO
 * @createTime 2021年11月01日 14:31:00
 */
@Component
public class PaymentFallbackServiceImpl implements PaymentHystrixService {

    @Override
    public String paymentInfoOK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }

}
