package com.emp.controller;

import com.emp.domain.Employee;
import com.emp.service.IEmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("test")
public class ControllerTest {
    // 使用employeeServiceImpl
    @Resource(name = "employeeService")
    private IEmployeeService employeeService;

    @RequestMapping("getEmp")
    public String getEmp(HttpServletRequest request, Integer id) {
        Employee employee =  employeeService.getEmployee(id);
        request.setAttribute("emp", employee);
        return "/test.jsp";
    }
}
