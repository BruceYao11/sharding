package com.test.sharding.dao;

import com.test.sharding.entity.Order;
import com.test.sharding.entity.OrderItem;
import com.test.sharding.entity.OrderVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderItemMapper {

    int insertOrderItem(OrderItem orderItem);

}
