package com.ani.spring.bank.exception;

import com.ani.spring.bank.dto.AppResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler({ AccountNotFoundException.class, InvalidAmountException.class })
    public ResponseEntity<AppResponse> handleBusinessException(RuntimeException ex) {
        return ResponseEntity.badRequest()
                .body(
                        AppResponse.builder()
                                .sts("fail")
                                .msg(ex.getMessage())
                                .build()
                );
    }

}
