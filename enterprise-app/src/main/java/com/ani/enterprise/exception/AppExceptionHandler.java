package com.ani.enterprise.exception;

import com.ani.enterprise.dto.AppRes;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
public class AppExceptionHandler {

    @ExceptionHandler(value = {InvalidCountryException.class, NoHandlerFoundException.class})
    public ResponseEntity<AppRes> notFoundHandler(Exception ex) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(
                        new AppRes("fail", ex.getMessage())
                );
    }
}
