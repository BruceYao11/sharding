package com.test.sharding.dao;

import com.test.sharding.entity.Dict;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface DictMapper {

    @Insert("insert into t_dict(dict_key, dict_value) values(#{dictKey}, #{dictValue})")
    int insertDict(Dict dict);

    @Delete("delete from t_dict where id = #{id}")
    void deleteDict(@Param("id") Long id);

    @Select("select * from t_dict")
    List<Dict> listDict();

}
