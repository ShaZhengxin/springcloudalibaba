package com.szx.service.impl;

import com.szx.dao.ProductDao;
import com.szx.domain.Product;
import com.szx.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author szx
 * @description TODO
 * @date 2021/10/11  21:46
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public Product findByPid(Integer pid) {
        return productDao.findById(pid).get();
    }
}
