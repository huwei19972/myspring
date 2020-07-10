package com.huwei.services;

import com.huwei.entity.User;

public interface UserService {
    User selectUserById(Integer userId);
}
