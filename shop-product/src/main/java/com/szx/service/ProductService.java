package com.szx.service;

import com.szx.domain.Product;
import org.springframework.stereotype.Service;

/**
 * @author szx
 * @description TODO
 * @date 2021/10/11  21:45
 */
@Service
public interface ProductService {

    public Product findByPid(Integer pid);
}
