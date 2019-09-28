package com.qs.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Account {
    private Integer id;
    private String name;
    private BigDecimal money;
}
