package com.ani.spring.data.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Employee {
    @Id
    private Long id;
    private String name;
    private LocalDate dob;
}
