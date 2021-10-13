package com.szx.controller;

import com.alibaba.fastjson.JSON;
import com.szx.domain.Product;
import com.szx.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author szx
 * @description TODO
 * @date 2021/10/11  21:47
 */
@RestController
@Slf4j
public class ProductController {
    @Resource
    private ProductService productService;
    @GetMapping("/product/{pid}")
    public Product product(@PathVariable("pid") Integer pid){
        Product product = productService.findByPid(pid);
        log.info("查询到的商品："+ JSON.toJSONString(product));
        return product;
    }
}
