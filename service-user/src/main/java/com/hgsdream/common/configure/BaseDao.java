package com.hgsdream.common.configure;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by Hong on 2017/7/7.
 */
public interface BaseDao<T> extends Mapper<T>,MySqlMapper<T> {

}
