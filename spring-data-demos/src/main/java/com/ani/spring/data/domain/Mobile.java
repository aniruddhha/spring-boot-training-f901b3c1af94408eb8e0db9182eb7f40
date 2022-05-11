package com.ani.spring.data.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Mobile {
    @Id
    private Long id;
    private String number;
    private String imei;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Override
    public String toString() {
        return "Mobile{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", imei='" + imei + '\'' +
                '}';
    }
}
