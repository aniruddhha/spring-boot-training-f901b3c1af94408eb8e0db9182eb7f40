package com.ani.spring.data;

import com.ani.spring.data.domain.Employee;
import com.ani.spring.data.repository.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataDemosApplication {

	public static void curdDemo(ApplicationContext ctx) {
		EmployeeRepository repository = ctx.getBean(EmployeeRepository.class);

		System.out.println("✅ Save Operation ");
		Employee emp1 = new Employee();
		emp1.setId(1L);
		emp1.setName("abc");
		emp1.setDob(LocalDate.of(1999, 1, 1));
		Employee empSaved1 = repository.save(emp1);

		Employee emp2 = new Employee();
		emp2.setId(2L);
		emp2.setName("pqr");
		emp2.setDob(LocalDate.of(1998, 1, 1));
		Employee empSaved2 = repository.save(emp2);

		System.out.println("✅ Select All Operation ");
		repository.findAll().forEach(System.out::println);

		System.out.println("✅ Delete Operation ");
		repository.deleteById(1L);
		repository.findAll().forEach(System.out::println);

		System.out.println("✅ Update Operation ");
//		Employee emp = new Employee(2L, "VVV", LocalDate.of(1998, 1,1));
//		repository.save(emp);
		repository.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemosApplication.class, args);
	}
}
