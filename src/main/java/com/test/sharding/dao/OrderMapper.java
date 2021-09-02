package com.test.sharding.dao;

import com.test.sharding.entity.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface OrderMapper {

    @Insert({"insert into t_order(user_id, order_name) values(#{userId}, #{orderName})"})
    int insertOrder(Order order);

    @Select("select t_order.order_id as orderId, t_order.user_id as userId, t_order.order_name as orderName " +
            "from t_order order by t_order.order_id desc " +
            "limit #{offset}, #{size}")
    List<Order> listOrder(@Param("offset") int offest, @Param("size") int size);

    @Select("select o.order_id as orderId, o.user_id as userId, o.order_name as orderName " +
            "from t_order o " +
            "join t_order_item i on o.order_id = i.order_id " +
            "where o.order_id = #{orderId}")
    Order getOrderById(@Param("orderId") Long id);

}
