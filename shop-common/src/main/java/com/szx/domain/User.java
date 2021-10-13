package com.szx.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author szx
 * @description TODO 用户
 * @date 2021/10/10  22:39
 */
@Entity(name = "shop_user")//实体类跟数据表的对应
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//数据库自增
    private Integer uid;//主键
    private String username;//用户名
    private String password;//密码
    private String telephone;//手机号
}
