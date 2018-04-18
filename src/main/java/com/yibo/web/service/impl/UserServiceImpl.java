package com.yibo.web.service.impl;

import com.yibo.web.dao.UserDao;
import com.yibo.web.entity.User;
import com.yibo.web.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    @Transactional(readOnly = true)
    public User getUserById(Integer id){
        return userDao.selectByPrimaryKey(id);
    }
}