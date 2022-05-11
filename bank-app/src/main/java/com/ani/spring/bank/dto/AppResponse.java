package com.ani.spring.bank.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AppResponse {
    private String sts;
    private String msg;
}
