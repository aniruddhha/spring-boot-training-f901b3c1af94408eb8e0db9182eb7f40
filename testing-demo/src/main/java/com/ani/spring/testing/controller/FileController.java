package com.ani.spring.testing.controller;

import com.ani.spring.testing.dto.AppRes;
import com.ani.spring.testing.dto.FileDto;
import com.ani.spring.testing.service.FileService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RequestMapping(value = "/file")
@RestController
public class FileController {

    private FileService service;

    @PostMapping
    public ResponseEntity<AppRes> saveFile(@RequestBody FileDto file) {
        return ResponseEntity.ok(AppRes.builder().build());
    }
}
