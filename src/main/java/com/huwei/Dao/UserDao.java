package com.huwei.Dao;


import com.huwei.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

@Mapper
public interface UserDao {
    public User selectUserById(Integer userId);

}