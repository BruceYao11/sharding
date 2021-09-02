package com.test.sharding.dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.test.sharding.entity.Order;
import org.apache.shardingsphere.api.hint.HintManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void insertOrder() {
        for (int i = 0; i < 1; i++) {
            Order order = new Order();
            order.setUserId((long)i);
            order.setOrderName("order" + order.getUserId());
            orderMapper.insertOrder(order);
        }
    }


    @Test
    public void getOrderById() {
        Order order = orderMapper.getOrderById(639858511827697665L);
        System.out.println(order);
    }

    @Test
    public void listOrder() {
        List<Order> orderList = orderMapper.listOrder(1, 2);
        String orderStr =  new Gson().toJson(orderList, new TypeToken<List<Order>>() {}.getType());
        System.out.println(orderStr);
    }

    @Test
    public void hintTest() {
        // Hint分片策略必须要使用 HintManager工具类
        HintManager hintManager = HintManager.getInstance();
        hintManager.addDatabaseShardingValue("t_order", 1L);
        hintManager.addTableShardingValue("t_order", 1L);
        Order order = new Order();
        order.setUserId(0L);
        order.setOrderName("order" + order.getUserId());
        orderMapper.insertOrder(order);
    }

}