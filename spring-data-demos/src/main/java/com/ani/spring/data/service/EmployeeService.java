package com.ani.spring.data.service;

import com.ani.spring.data.domain.Employee;
import com.ani.spring.data.domain.Mobile;
import com.ani.spring.data.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

// A - Atomicity
// C - Consistency
// I - Isolation
// D - Durability

@Transactional // Session Related Problem Will Be solved By this
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public void crudDemo() {
        System.out.println("✅ Save Operation ");
        Employee emp1 = new Employee();
        emp1.setId(1L);
        emp1.setName("abc");
        emp1.setDob(LocalDate.of(1999, 1, 1));

        Mobile mb1 = new Mobile();
        mb1.setId(1L);
        mb1.setImei("skfhskjf");
        mb1.setNumber("78757456");
        mb1.setEmployee(emp1);

        Mobile mb2 = new Mobile();
        mb2.setId(2L);
        mb2.setImei("ajfdsjkf");
        mb2.setNumber("8775765");
        mb2.setEmployee(emp1);

        List<Mobile> mobiles = List.of(mb1, mb2);
        emp1.setMobiles(mobiles);

        Employee empSaved1 = repository.save(emp1);

//		Employee emp2 = new Employee();
//		emp2.setId(2L);
//		emp2.setName("pqr");
//		emp2.setDob(LocalDate.of(1998, 1, 1));
//		Employee empSaved2 = repository.save(emp2);

//		System.out.println("✅ Select All Operation ");
//		repository.findAll().forEach(System.out::println);

//		System.out.println("✅ Delete Operation ");
//		repository.deleteById(1L);
//		repository.findAll().forEach(System.out::println);

//		System.out.println("✅ Update Operation ");
//		Employee emp = new Employee(2L, "VVV", LocalDate.of(1998, 1,1), List.of());
//		repository.save(emp);
//		repository.findAll().forEach(System.out::println);

        Employee emp = repository.findById(1L).orElseThrow();
        emp.getMobiles().forEach(System.out::println);
    }
}
