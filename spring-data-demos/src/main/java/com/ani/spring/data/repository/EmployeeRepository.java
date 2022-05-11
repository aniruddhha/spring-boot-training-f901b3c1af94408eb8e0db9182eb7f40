package com.ani.spring.data.repository;

import com.ani.spring.data.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> { }
