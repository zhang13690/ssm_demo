package com.zhang.service;

import com.zhang.domain.Employee;

import java.util.List;

public interface IEmployeeService {

    /**
     * 查询所有的员工数据
     * @return 所有的员工
     */
    List<Employee> findAllEmployees();

    // 添加一条员工数据
    void addEmployee(Employee employee);
}
