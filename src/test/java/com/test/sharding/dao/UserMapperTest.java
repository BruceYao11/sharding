package com.test.sharding.dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.test.sharding.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: yaoji
 * @date: 2021/8/24 16:52
 * @description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void listUser() {
        List<User> list = userMapper.listUser();
        String userList = new Gson().toJson(list, new TypeToken<List<User>>() {}.getType());
        System.out.println(userList);
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setName("admin");
        user.setPassword("123456");
        userMapper.insertUser(user);
    }

}