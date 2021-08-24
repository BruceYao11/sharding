package com.test.sharding.dao;

import com.test.sharding.entity.Dict;
import com.test.sharding.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DictMapper {

    @Insert("insert into t_dict(dict_key, dict_value) values(#{dictKey}, #{dictValue})")
    int insertDict(Dict dict);

    @Delete("delete from t_dict where id = #{id}")
    void deleteDict(@Param("id") Long id);

}
