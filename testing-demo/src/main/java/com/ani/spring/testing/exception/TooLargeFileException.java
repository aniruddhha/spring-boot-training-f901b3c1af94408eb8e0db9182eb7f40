package com.ani.spring.testing.exception;

public class TooLargeFileException extends RuntimeException {

    public TooLargeFileException(String message) {
        super(message);
    }
}
