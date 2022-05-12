package com.ani.dep;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
@SpringBootApplication
public class WardepApplication extends SpringBootServletInitializer {

	@GetMapping
	public String hi() {
		return  "hi";
	}
}
