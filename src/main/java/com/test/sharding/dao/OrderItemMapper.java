package com.test.sharding.dao;

import com.test.sharding.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemMapper {

    int insertOrderItem(OrderItem orderItem);

}
