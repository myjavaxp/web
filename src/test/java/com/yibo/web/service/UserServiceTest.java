package com.yibo.web.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void getUserById() {
        System.out.println(userService.getUserById(1));
    }
}