package com.hgsdream.service.impl;

import com.hgsdream.dao.UserDao;
import com.hgsdream.entity.User;
import com.hgsdream.mapper.UserMapper;
import com.hgsdream.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Hong on 2017/7/7.
 */
@Service
public class UserServiceImpl implements UserService{
//    @Autowired
//    private UserDao userDao;

    @Autowired
    private UserMapper userMapper;
    public User selectUserById(Integer id){
        User user = userMapper.getUserById(id);
//        System.out.print(user);
        return user;
    }

    @Override
    public List<User> selectAllUser() {
//        List<User> list = userDao.selectAllUser();
        List<User> list = userMapper.getAll();
        return list;
    }
}
