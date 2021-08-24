package com.test.sharding.entity;

/**
 * 订单实体类
 *
 */
public class Order {
    private Long orderId;

    private Long userId;

    private String orderName;

    public Order() {}

    public Order(Long orderId,Long userId,String orderName){
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
}
