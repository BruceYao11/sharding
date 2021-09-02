package com.test.sharding.dao;

import com.test.sharding.entity.Dict;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author: yaoji
 * @date: 2021/8/24 13:37
 * @description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class DictMapperTest {

    @Autowired
    private DictMapper dictMapper;

    @Test
    public void insertDict() {
        Dict dict = new Dict();
        dict.setDictKey("xxxxxxx");
        dict.setDictValue("xxxx");
        dictMapper.insertDict(dict);
    }

    @Test
    public void deleteDict() {
        Long id = 637312484063051776L;
        dictMapper.deleteDict(id);
    }

    @Test
    public void listDict() {
        List<Dict> list = dictMapper.listDict();
    }

}