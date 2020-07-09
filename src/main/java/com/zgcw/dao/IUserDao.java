package com.zgcw.dao;

import com.zgcw.entity.User;

import java.util.List;

public interface IUserDao {
    /**获得所有*/
    List<User> getAll();
    /**根据用户编号获得用户对象*/
    User getUserById(int id);
    /**新增*/
    boolean add(User user);
    /**删除*/
    boolean delete(int id);
    /**更新*/
    boolean update(User user);
}
