package com.szx.controller;

import com.alibaba.fastjson.JSON;
import com.szx.domain.Order;
import com.szx.domain.Product;
import com.szx.service.OrderService;
import com.szx.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

/**
 * @author szx
 * @description TODO
 * @date 2021/10/12  23:37
 */
//@RestController
@Slf4j
public class OrderController {
    @Resource
    private OrderService orderService;

    @Resource
    private ProductService productService;


    //准备买1件商品
    @GetMapping("/order/prod/{pid}")
    public Order product(@PathVariable("pid") Integer pid) {
        log.info(">>客户下单，这时候要调用商品微服务查询商品信息");

        //问题1：代码可读性不好
        //2:编程风格不统一
        //通过fegin调用商品微服务
        Product product = productService.findById(pid);
        log.info(">>商品信息,查询结果:" + JSON.toJSONString(product));
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");
        order.setPid(product.getPid());
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);
        orderService.save(order);
        return order;
    }
}
