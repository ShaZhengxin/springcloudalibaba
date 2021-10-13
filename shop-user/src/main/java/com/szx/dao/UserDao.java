package com.szx.dao;

import com.szx.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author szx
 * @description TODO
 * @date 2021/10/11  21:36
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
