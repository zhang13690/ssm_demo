package com.zhang.mapper;

import com.zhang.domain.Employee;

import java.util.List;

public interface EmployeeMapper {
    /**
     * 查询所有的员工数据
     * @return 所有的员工
     */
    List<Employee> selectEmployees();

    // 添加一条员工数据
    void addEmployee(Employee employee);
}
