package com.ani.spring.controller;

import com.ani.spring.util.AdvanceDateUtil;
import com.ani.spring.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CustomerController {

    // 👉 customer controller is dependent on date util

    @Autowired // ✅ field level injection
    @Qualifier("rev2")
    private DateUtil util;

//    @Autowired // ✅ constructor injection
//    public CustomerController(DateUtil util) {
//        this.util = util;
//    }

//    @Autowired // ✅ setter injection
//    public void setUtil( @Qualifier("rev2") DateUtil util) {
//        this.util = util;
//    }

    public void calculateAge() {
        long age = util.diffFromToday(LocalDate.of(2000, 1, 1));
        System.out.println("Age is "+age);
    }
}
