package com.huwei.test;

import com.huwei.entity.User;
import com.huwei.services.UserService;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;



public class UserServiceTest extends testone{
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Test
    public void selectUserByIdTest(){
        User user = userService.selectUserById(10);
        logger.info("查找结果" + user);
    }

}