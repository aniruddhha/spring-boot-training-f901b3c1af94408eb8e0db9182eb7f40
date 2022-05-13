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

    @PostMapping // POST: http://localhost:8989/file/
    public ResponseEntity<AppRes> saveFile(@RequestBody FileDto file) {

        String msg = service.saveFile(file);

        AppRes res = AppRes.builder()
                .sts("success")
                .msg(msg)
                .build();

        return ResponseEntity.ok(res);
    }

    @GetMapping
    public String hi() {
        return "hi";
    }
}
