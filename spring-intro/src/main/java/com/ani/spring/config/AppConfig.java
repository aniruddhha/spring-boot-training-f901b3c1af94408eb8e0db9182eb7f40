package com.ani.spring.config;

import com.ani.spring.controller.CustomerController;
import com.ani.spring.util.DateUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// bean definitions can be provided by different ways
// 👉 XML
// 👉 Java Config ✅
// 👉 Annotation

@Configuration
public class AppConfig {

    @Bean(name = "rev1")
    public DateUtil dateUtil1() {
        return new DateUtil();
    }

    @Bean(name = "rev2")
    public DateUtil dateUtil2() {
        return new DateUtil();
    }

//    @Bean
//    public CustomerController customerController(DateUtil util) {
//        return new CustomerController(util);
//    }
}
