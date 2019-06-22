package com.yibo.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@RestController
@Slf4j
public class GlobalExceptionController {

    @ExceptionHandler(value = Exception.class)
    public String defaultExceptionHandler(HttpServletRequest request, Exception exception) {
        log.error("---DefaultException Handler---Host {} invokes url {} ERROR: {}", request.getRemoteHost(), request.getRequestURL(), exception.getMessage());
        exception.printStackTrace();
        return exception.getMessage();
    }
}