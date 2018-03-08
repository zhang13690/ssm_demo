package com.zhang.test;

import com.zhang.domain.Employee;
import com.zhang.mapper.EmployeeMapper;
import com.zhang.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

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
        List<Employee> employee = employeeService.findAllEmployees();
        System.out.println(employee);
    }

    @Test
    @Transactional
    public void testDao() {
        List<Employee> employee = employeeMapper.selectEmployees();
        System.out.println(employee);
    }

}
