package com.zhang.test;

import com.zhang.domain.User;
import com.zhang.mapper.UserMapper;
import com.zhang.service.IUserService;
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
    @Resource
    private IUserService userService;
    @Resource
    private UserMapper userMapper; // 也测试DAO的Mapper

    @Test
    @Transactional
    public void testService() { // 测试Service
        // 测试getUserByAccount
        User user = userService.getUserByAccount("zs");
        System.out.println(user); // 由于User类重写了toString方法，因此可直接输出查看信息
        // 测试
        boolean login = userService.login("zs", "123456");
        System.out.println(login);
    }

    @Test
    @Transactional
    public void testDao() { // 测试Mapper
        User user = userMapper.getUserByAccount("zs");
        System.out.println(user);
    }
}
