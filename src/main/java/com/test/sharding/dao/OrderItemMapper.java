package com.test.sharding.dao;

import com.test.sharding.entity.OrderItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface OrderItemMapper {

    @Insert("insert into t_order_item(order_id, user_id, item_name) values(#{orderId}, #{userId}, #{itemName})")
    int insertOrderItem(OrderItem orderItem);

}
