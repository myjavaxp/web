package com.yibo.web.job;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yibo.web.dao.EmployeeDao;
import com.yibo.web.entity.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@Component
@Slf4j
public class EmployeeJob {
    private static final Random RANDOM = new Random();
    @Resource
    private EmployeeDao employeeDao;

    public void getEmployeeById() {
        List<Integer> idList = employeeDao.getIdList();
        if (CollectionUtils.isEmpty(idList)) {
            return;
        }
        int size = idList.size();
        Employee employee = employeeDao.selectByPrimaryKey(idList.get(RANDOM.nextInt(size)));
        log.info("Get a random employee:\n{}", JSON.toJSONString(employee, SerializerFeature.PrettyFormat));
    }
}