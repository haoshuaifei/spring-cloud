package com.henu.hsf.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author hsf
 * @version 1.0.0
 * @ClassName Payment.java
 * @Description TODO
 * @createTime 2021年10月27日 11:36:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
