package com.szx.controller;

import com.alibaba.fastjson.JSON;
import com.szx.domain.Order;
import com.szx.domain.Product;
import com.szx.service.OrderService;
import com.szx.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author szx
 * @description TODO
 * @date 2021/10/15  0:03
 */
@RestController
@Slf4j
public class OrderController2 {
    @Resource
    private OrderService orderService;

    @Resource
    private ProductService productService;


    //准备买1件商品
    @GetMapping("/order/prod/{pid}")
    public Order product(@PathVariable("pid") Integer pid) {
        log.info("接收到{}号商品的下单请求,接下来调用商品微服务查询此商品信息", pid);


        //调用商品微服务,查询商品信息
        Product product = productService.findById(pid);
        log.info("查询到{}号商品的信息,内容是:{}", pid, JSON.toJSONString(product));

        //模拟一次网络延时
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //下单(创建订单)
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");
        order.setPid(product.getPid());
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);


        //为了不产生太多垃圾数据,暂时不做订单保存
        log.info("创建订单成功,订单信息为{}", JSON.toJSONString(order));
        return order;
    }
}
