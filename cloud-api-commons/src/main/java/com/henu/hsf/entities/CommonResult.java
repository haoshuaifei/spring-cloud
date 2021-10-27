package com.henu.hsf.entities;

import lombok.Data;

/**
 * @author hsf
 * @version 1.0.0
 * @ClassName CommonResult.java
 * @Description TODO
 * @createTime 2021年10月27日 11:37:00
 */
@Data
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}