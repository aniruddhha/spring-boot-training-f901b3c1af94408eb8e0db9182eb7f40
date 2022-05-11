package com.ani.spring.data.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Student {

    @Id
    private Long id;

    private String name;

    @Column(unique = true)
    private Integer rollNo;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}
