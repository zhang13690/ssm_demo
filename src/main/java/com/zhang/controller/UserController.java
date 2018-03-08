package com.zhang.controller;

import com.zhang.domain.User;
import com.zhang.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource(name = "userService")
    private IUserService userService;

    // 登录功能
    @RequestMapping("login")
    public String login(HttpSession session, String account, String password) {
        String returnView = null;
        // 检查是否登录成功
        if (userService.login(account, password)) {
            // 登录成功，查出用户信息，并保存到session中
            User user = userService.getUserByAccount(account);
            session.setAttribute("user", user);
            // 返回功能页面
            returnView = "/funcpage.jsp";
        } else {
            // 否则直接返回登录页面
            returnView = "/login.jsp";
        }
        return returnView;
    }
}
