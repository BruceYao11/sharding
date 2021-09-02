package com.test.sharding.dao;

import com.test.sharding.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {

    @Select("select * from t_user")
    List<User> listUser();

    @Insert("insert into t_user(id, name, password) values(#{id}, #{name}, #{password})")
    int insertUser(User user);

}
