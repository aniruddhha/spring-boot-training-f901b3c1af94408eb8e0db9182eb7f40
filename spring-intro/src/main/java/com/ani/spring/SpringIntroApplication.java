package com.ani.spring;

import com.ani.spring.controller.CustomerController;
import com.ani.spring.util.AdvanceDateUtil;
import com.ani.spring.util.DateUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroApplication.class, args);

		DateUtil util1 = new DateUtil();
		long days = util1.diffFromToday(LocalDate.of(2000,1,1));
		System.out.println("Days Are " + days);

		DateUtil util2 = new AdvanceDateUtil();

		CustomerController controller1 = new CustomerController(util1);
		CustomerController controller2 = new CustomerController(util2);
	}
}
