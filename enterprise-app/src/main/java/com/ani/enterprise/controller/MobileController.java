package com.ani.enterprise.controller;

import com.ani.enterprise.dto.MobileDto;
import com.ani.enterprise.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

//@Component
@Controller // this receives and sends back data to client
public class MobileController {

    @Autowired
    private MobileService service;

    public String generateMobile(MobileDto dto) {
        return service.createMobile(dto);
    }
}
