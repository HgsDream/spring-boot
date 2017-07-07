package com.hgsdream.mapper;

import com.hgsdream.entity.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by Hong on 2017/7/7.
 * 用户数据库操作映射
 */
public interface UserMapper {
    /**
     * 获取所有的用户信息
     * @return
     */
    List<User> getAll();

    /**
     * 根据id获取用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") int id);
}
