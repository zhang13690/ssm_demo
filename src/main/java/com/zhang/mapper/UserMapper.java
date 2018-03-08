package com.zhang.mapper;

import com.zhang.domain.User;

public interface UserMapper {
    /**
     * 根据账号account查询用户
     * @param account 用户账号account
     * @return 和账号相关的用户
     */
    User getUserByAccount(String account);
}
