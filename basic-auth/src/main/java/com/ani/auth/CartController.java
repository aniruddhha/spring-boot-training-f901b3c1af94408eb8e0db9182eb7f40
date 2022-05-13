package com.ani.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/cart")
@RestController
public class CartController {

    @GetMapping
    public String item() {
        return "its cart item";
    }
}
