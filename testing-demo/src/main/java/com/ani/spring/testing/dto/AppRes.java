package com.ani.spring.testing.dto;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
public class AppRes {
    private String sts;
    private String msg;
}
