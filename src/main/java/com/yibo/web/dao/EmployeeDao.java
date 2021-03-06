package com.yibo.web.dao;

import com.yibo.web.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Integer> getIdList();
}