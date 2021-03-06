package com.zgcw.dao;

import com.zgcw.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO implements IUserDao{
    private static List<User> users = new ArrayList<User>();

    static {
        users.add(new User(1, "刘德华", "中国香港", "13767890098"));
        users.add(new User(2, "张学友", "中国广东", "18989890767"));
        users.add(new User(3, "张国立", "中国北京", "13345672345"));
        users.add(new User(4, "张靓因", "中国上海", "15890908679"));
        users.add(new User(5, "齐萍萍", "中国珠海", "13246712235"));
    }

    /**
     * 获得所有
     */
    public List<User> getAll() {
        return users;
    }

    /**
     * 单个用户
     */
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    /**
     * 添加
     */
    public boolean add(User user) {
        if(user.getId()<=0)
        {
            user.setId(users.get(users.size()-1).getId()+1);
        }
        users.add(user);
        return true;
    }

    /**
     * 删除
     */
    public boolean delete(int id) {
        users.remove(getUserById(id));
        return true;
    }

    /**
     * 更新
     */
    public boolean update(User user) {
        User oldUser = getUserById(user.getId());
        oldUser.setName(user.getName());
        oldUser.setAddress(user.getAddress());
        oldUser.setPhone(user.getPhone());
        return true;
    }
}
