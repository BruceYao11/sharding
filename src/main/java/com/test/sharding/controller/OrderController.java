package com.test.sharding.controller;

import com.test.sharding.entity.AjaxResult;
import com.test.sharding.entity.Order;
import com.test.sharding.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: yaoji
 * @date: 2021/8/23 16:18
 * @description:
 */
@Api(value = "Order Api")
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/add")
    @ApiOperation("add")
    public AjaxResult<String> insertOrder(@RequestBody Order order) {
        AjaxResult<String> ajaxResult = new AjaxResult<>();
        int i = 0;
        try {
            i = orderService.insertOrder(order);
        } catch (RuntimeException e) {
            return ajaxResult.error(e.getMessage());
        }
        return ajaxResult.success(i + "");
    }

    @GetMapping("/listPage")
    @ApiOperation("listPage")
    public AjaxResult<List<Order>> listOrder(int page, int size) {
        AjaxResult<List<Order>> ajaxResult = new AjaxResult<>();
        List<Order> orderList = orderService.listOrder(page, size);
        return ajaxResult.success(orderList);
    }
}
