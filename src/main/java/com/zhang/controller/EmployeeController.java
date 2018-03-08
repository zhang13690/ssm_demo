package com.zhang.controller;

import com.zhang.domain.Employee;
import com.zhang.service.IEmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("emp")
public class EmployeeController {
    // 使用employeeServiceImpl
    @Resource(name = "employeeService")
    private IEmployeeService employeeService;

    @RequestMapping("findAllEmps")
    public String findAllEmps(HttpServletRequest request) {
        List<Employee> empList =  employeeService.findAllEmployees();
        request.setAttribute("empList", empList);
        return "/WEB-INF/emp_list.jsp";
    }

    @RequestMapping("addEmployee")
    public @ResponseBody Employee addEmployee() {
        Employee emp = new Employee();
        emp.setId(123);
        emp.setName("张三");
        employeeService.addEmployee(emp);
        return emp;
    }
}
