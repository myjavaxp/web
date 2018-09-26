package com.yibo.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
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
    public Map<String, String> hi(@PathVariable String name) {
        String string = new String(name.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        System.out.println(string);
        Map<String, String> map = new HashMap<>();
        map.put("name", string);
        return map;
    }
}