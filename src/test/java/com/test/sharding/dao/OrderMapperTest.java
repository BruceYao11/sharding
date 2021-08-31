package com.test.sharding.dao;

import com.test.sharding.entity.Order;
import com.test.sharding.entity.OrderVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void insertOrder() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setUserId((long)i);
            order.setOrderName("order" + order.getUserId());
            orderMapper.insertOrder(order);
        }
    }


    @Test
    public void getOrderById() {
        Order order = orderMapper.getOrderById(636878541421543425L);
        System.out.println(order);
    }

}