package com.test.sharding.service;

import com.test.sharding.dao.OrderMapper;
import com.test.sharding.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: yaoji
 * @date: 2021/8/23 14:30
 * @description:
 */
@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public int insertOrder(Order order) {
        int i = orderMapper.insertOrder(order);
        if (order.getUserId() > 100) {
            throw new RuntimeException("太大了");
        }
        return i;
    }

    public List<Order> listOrder(int page, int size) {
        return orderMapper.listOrder((page - 1) * size, size);
    }
}
