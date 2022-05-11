package com.ani.spring.data.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee {
    @Id
    private Long id;
    private String name;
    private LocalDate dob;

    @OneToMany(mappedBy = "employee")
//    @OneToMany
    private List<Mobile> mobiles;
}
