package com.example.ex06.error;

import org.springframework.http.HttpStatus;

public enum ErrorCode {

    // ctrl + shift + x 번역 단축키
    DUPLICATE_USERS(HttpStatus.BAD_REQUEST,"중복된 이메일입니다...");

    private HttpStatus httpStatus;
    private String message;

    ErrorCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getMessage() {
        return message;
    }
}
