package com.yibo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/{name}")
    public Map<String, String> hi(@PathVariable String name) throws UnsupportedEncodingException {
        String string = new String(name.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(string);
        Map<String, String> map = new HashMap<>();
        map.put("name", string);
        return map;
    }
}