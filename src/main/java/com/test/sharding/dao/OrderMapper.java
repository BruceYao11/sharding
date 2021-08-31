package com.test.sharding.dao;

import com.test.sharding.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

//    @Insert({"insert into t_order(user_id, order_name) values(#{userId}, #{orderName})"})
    int insertOrder(Order order);

    List<Order> listOrder(@Param("offset") int offest, @Param("size") int size);

    Order getOrderById(@Param("orderId") Long id);

}
