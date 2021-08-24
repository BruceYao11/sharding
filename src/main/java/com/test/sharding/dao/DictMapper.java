package com.test.sharding.dao;

import com.test.sharding.entity.Dict;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DictMapper {

    @Insert("insert into t_dict(dict_key, dict_value) values(#{dictKey}, #{dictValue})")
    int insertDict(Dict dict);

    @Delete("delete from t_dict where id = #{id}")
    void deleteDict(@Param("id") Long id);

}
