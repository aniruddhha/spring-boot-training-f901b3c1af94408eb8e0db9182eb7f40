package com.ani.enterprise;

import com.ani.enterprise.controller.MobileController;
import com.ani.enterprise.dto.MobileDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EnterpriseAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EnterpriseAppApplication.class, args);
		MobileController controller = ctx.getBean(MobileController.class);

		MobileDto dto = new MobileDto(1L, "99999999", "IN", true);

		controller.generateMobile(dto);
	}

}
