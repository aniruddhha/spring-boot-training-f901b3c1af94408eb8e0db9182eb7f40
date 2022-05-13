package com.ani.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/billing")
@RestController
public class BillingController {

    @GetMapping
    public String bill() {
        return "its billing";
    }
}
