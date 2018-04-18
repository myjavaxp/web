package com.yibo.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
@RestController
public class GlobalExceptionController {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionController.class);

    @ExceptionHandler(value = Exception.class)
    public String defaultExceptionHandler(HttpServletRequest request, Exception exception) {
        LOGGER.error("---DefaultException Handler---Host {} invokes url {} ERROR: {}", request.getRemoteHost(), request.getRequestURL(), exception.getMessage());
        exception.printStackTrace();
        return exception.getMessage();
    }
}