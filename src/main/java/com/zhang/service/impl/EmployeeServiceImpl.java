package com.zhang.service.impl;

import com.zhang.domain.Employee;
import com.zhang.mapper.EmployeeMapper;
import com.zhang.service.IEmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

    // 使用注解使用mapper的bean
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Employee> findAllEmployees() {
        return employeeMapper.selectEmployees();
    }

    @Override
    @Transactional(readOnly = false)
    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }
}
