package com.szx.service;

import com.szx.domain.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author szx
 * @description TODO
 * @date 2021/10/13  23:51
 */
@FeignClient("service-product")//声明调用的提供者的name
public interface ProductService {
    //指定调用提供者的哪个方法
    // @FeignClient+@GetMapping 就是一个完整的请求路径 http://service- product/product/{pid}
    @GetMapping("/product/{pid}")
    Product findById(@PathVariable("pid") Integer pid);
}
