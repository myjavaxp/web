package com.yibo.web.job;

import com.yibo.web.dao.EmployeeDao;
import com.yibo.web.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class EmployeeJob {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeJob.class);
    @Resource
    private EmployeeDao employeeDao;

    public void getEmployeeById() {
        Employee employee = employeeDao.selectByPrimaryKey(1);
        LOGGER.info(employee.toString());
    }
}