package com.ani.spring.data.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    private Long id;

    @Column(nullable = false)
    private String courseName;
    private String author;

    @ManyToMany
    @JoinTable(
            name ="course_student",
            joinColumns = {
                    @JoinColumn(name = "course_id", referencedColumnName = "id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "student_id", referencedColumnName = "id")
            }

    )
    private List<Student> students;
}
