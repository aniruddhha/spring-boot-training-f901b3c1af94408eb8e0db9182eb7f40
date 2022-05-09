package com.ani.spring.controller;

import com.ani.spring.util.AdvanceDateUtil;
import com.ani.spring.util.DateUtil;

import java.time.LocalDate;

public class CustomerController {

    private DateUtil util;

//    public CustomerController() {
//        util = new AdvanceDateUtil();
//    }

    public CustomerController(DateUtil util) { // customer controller is dependent on date util
        this.util = util;
    }

    public void calculateAge() {
        long age = util.diffFromToday(LocalDate.of(2000, 1, 1));
    }
}
