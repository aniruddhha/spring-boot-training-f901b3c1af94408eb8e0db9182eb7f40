package com.ani.spring.data;

import com.ani.spring.data.domain.Employee;
import com.ani.spring.data.domain.Mobile;
import com.ani.spring.data.repository.EmployeeRepository;
import com.ani.spring.data.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SpringDataDemosApplication {



	public static void derivedMethods(ApplicationContext ctx) {
		EmployeeRepository repository = ctx.getBean(EmployeeRepository.class);

		repository.findByNameLike("a%");

		repository.findByDobBetween(
				LocalDate.of(1900,1,1),
				LocalDate.now()
		);

		repository.findAllIds();

		repository.findByNameOrDob("abc", null);
	}

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDataDemosApplication.class, args);
//		derivedMethods(ctx);

		EmployeeService service = ctx.getBean(EmployeeService.class);
		service.crudDemo();
	}
}
