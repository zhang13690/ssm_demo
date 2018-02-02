package com.emp.test;

import com.emp.domain.Employee;
import com.emp.mapper.EmployeeMapper;
import com.emp.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring/applicationContext.xml"})
public class ServiceTest {
    // 注入需要的属性
    @Resource(name = "employeeService")
    private IEmployeeService employeeService;
    @Resource(name = "employeeMapper")
    private EmployeeMapper employeeMapper;

    @Test
    @Transactional
    public void testService() {
        Employee employee = employeeService.getEmployee(1);
        System.out.println(employee.getName());
    }

    @Test
    @Transactional
    public void testDao() {
        Employee employee = employeeMapper.selectEmp(1);
        System.out.println(employee.getName());
    }

}
