package com.szx.dao;

import com.szx.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author szx
 * @description TODO
 * @date 2021/10/12  23:37
 */
public interface OrderDao extends JpaRepository<Order,Long> {
}
