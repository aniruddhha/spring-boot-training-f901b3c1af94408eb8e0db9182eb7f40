package com.ani.spring.data.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Mobile {
    @Id
    private Long id;
    private String number;
    private String imei;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
