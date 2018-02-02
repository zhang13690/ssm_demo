package com.emp.service.impl;

import com.emp.domain.Employee;
import com.emp.mapper.EmployeeMapper;
import com.emp.service.IEmployeeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

    // 使用注解使用mapper的bean
    @Resource
    private EmployeeMapper employeeMapper;

    @Override
    @Transactional(readOnly = true)
    public Employee getEmployee(Integer id) {
        return employeeMapper.selectEmp(id);
    }
}
