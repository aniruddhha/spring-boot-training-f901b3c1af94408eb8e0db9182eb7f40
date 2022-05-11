package com.ani.spring.data.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class RegCert {

    @Id
    private Long id;
    private String rcNum;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Car car;
}
