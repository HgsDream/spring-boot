package com.hgsdream.service;

import com.hgsdream.entity.User;

import java.util.List;


/**
 * Created by Hong on 2017/7/4.
 */
public interface UserService {
    /**
     * 根据id获取某个用户信息
     * @param id
     * @return
     */
    public User selectUserById(Integer id);

    /**
     * 获取全部用户信息
     * @return
     */
    public List<User> selectAllUser();
}
