package com.ani.spring.bank.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Bank {
    private Long custId;
    private String acNum;
    private String acNm;
    private Double balance;
    private LocalDate lastUpdate;
}
