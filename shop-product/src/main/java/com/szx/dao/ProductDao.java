package com.szx.dao;

import com.szx.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author szx
 * @description TODO
 * @date 2021/10/11  21:44
 */
public interface ProductDao extends JpaRepository<Product,Integer> {
}
