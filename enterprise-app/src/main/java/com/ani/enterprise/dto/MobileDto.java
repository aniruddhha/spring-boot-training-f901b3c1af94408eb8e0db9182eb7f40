package com.ani.enterprise.dto;

import lombok.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class MobileDto {
    private Long id;
    private String number;
    private String country;
    private Boolean isDualSim;
}
