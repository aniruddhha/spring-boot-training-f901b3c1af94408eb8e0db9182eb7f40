package com.ani.devtools;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempController {

    @GetMapping
    public String hi() {
        return "hello";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hi";
    }

}
