package com.test.sharding.entity;

import java.util.List;

/**
 * 订单实体类
 *
 */
public class OrderVO {
    private Long orderId;

    private Long userId;

    private String orderName;

    private List<OrderItem> orderItemList;

    public OrderVO() {}

    public OrderVO(Long orderId, Long userId, String orderName){
        this.orderId = orderId;
        this.userId = userId;
        this.orderName = orderName;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
}
