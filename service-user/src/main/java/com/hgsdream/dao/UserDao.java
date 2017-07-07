package com.hgsdream.dao;

import com.hgsdream.common.configure.BaseDao;
import com.hgsdream.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * Created by Hong on 2017/7/7.
 */
public interface UserDao extends BaseDao<User> {

    @Select("select *from user where id = #{id}")
    public User selectById(Integer id);

    @Select("select *from user")
    public List<User> selectAllUser();
}
