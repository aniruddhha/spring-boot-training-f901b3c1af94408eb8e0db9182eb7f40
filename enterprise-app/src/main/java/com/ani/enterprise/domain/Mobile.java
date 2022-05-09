package com.ani.enterprise.domain;

import lombok.*;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Mobile { // object of these classes will represent rows, class represents table
    private Long id;
    private String number;
    private String country;
    private Boolean isDualSim;
}
