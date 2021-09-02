package com.test.sharding.dao;

import com.test.sharding.entity.OrderItem;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author: yaoji
 * @date: 2021/8/24 15:11
 * @description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
class OrderItemMapperTest {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Test
    void insertOrderItem() {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderId(639858511827697665L);
        orderItem.setUserId(1L);
        orderItem.setItemName("YYYY");
        orderItemMapper.insertOrderItem(orderItem);
    }
}