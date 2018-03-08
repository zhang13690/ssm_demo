package com.zhang.service;

import com.zhang.domain.User;

public interface IUserService {

    /**
     * 根据账号查询用户
     * @param account
     * @return
     */
    User getUserByAccount(String account);

    /**
     * 根据账号和密码查询是否能登录
     * @param account 账号
     * @param pwd 密码
     * @return 是否能登录
     */
    boolean login(String account, String pwd);

}
