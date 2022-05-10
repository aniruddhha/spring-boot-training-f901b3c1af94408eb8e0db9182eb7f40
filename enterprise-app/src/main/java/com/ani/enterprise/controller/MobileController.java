package com.ani.enterprise.controller;

import com.ani.enterprise.dto.AppRes;
import com.ani.enterprise.dto.MobileDto;
import com.ani.enterprise.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Component
@RequestMapping("/mobile")
@RestController // this receives and sends back data to client
public class MobileController {

    @Autowired
    private MobileService service;

    @PostMapping   // POST: http://localhost:8989/mobile/
    public ResponseEntity<AppRes> addNewMobile(@RequestBody MobileDto dto) {

        service.createMobile(dto);

        AppRes res = new AppRes("success", "added new mobile");

        return new ResponseEntity<>(res, HttpStatus.CREATED );
    }

    @GetMapping // GET: http://localhost:8989/mobile/
    public ResponseEntity<List<MobileDto>> showAll() {
        return ResponseEntity.ok(service.showAllMobiles());
    }
}
