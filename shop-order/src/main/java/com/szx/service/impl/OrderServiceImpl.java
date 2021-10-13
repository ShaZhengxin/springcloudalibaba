package com.szx.service.impl;

import com.szx.dao.OrderDao;
import com.szx.domain.Order;
import com.szx.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author szx
 * @description TODO
 * @date 2021/10/12  23:40
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    @Override
    public void save(Order order) {
        orderDao.save(order);
    }
}
