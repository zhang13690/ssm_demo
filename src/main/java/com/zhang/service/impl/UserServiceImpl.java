package com.zhang.service.impl;

import com.zhang.domain.User;
import com.zhang.mapper.UserMapper;
import com.zhang.service.IUserService;
import com.zhang.utils.MessageDigestUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource(name = "userMapper")
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = true)
    public User getUserByAccount(String account) {
        return userMapper.getUserByAccount(account);
    }

    @Override
    @Transactional(readOnly = true)
    public boolean login(String account, String pwd) {
        // 如果某个为null，直接返回false
        if (account == null || pwd == null) {
            return false;
        }

        boolean flag = false; // 是否能成功登录的标记
        // 先找到用户
        User user = userMapper.getUserByAccount(account);
        if (user == null) {
            flag = false;
        } else {
            // 判断传递过来的密码使用MD5加密后，能否和查询出的用户密码匹配
            // 因为数据库中密码就是以MD5存储的。
            // 如果匹配就表示能够登录成功
            String pwdMd5 = MessageDigestUtils.encrypt("MD5", pwd.getBytes(), false);
            flag = pwdMd5.equalsIgnoreCase(user.getPassword());
        }
        return flag;
    }
}
