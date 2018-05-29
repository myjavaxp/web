package com.yibo.web.service;

import com.yibo.web.config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {RootConfig.class})
@WebAppConfiguration
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void getUserById() {
        System.out.println(userService.getUserById(1));
    }
}