package com.ani.spring.data.repository;

import com.ani.spring.data.domain.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    List<Employee> findByNameLike(String nm);

    List<Employee> findByDobBetween(LocalDate st, LocalDate ed);

    List<Employee> findByNameOrDob(String name, LocalDate dob);

    @Query(value = "select id from employee", nativeQuery = true)
    List<Employee> findAllIds();
}
