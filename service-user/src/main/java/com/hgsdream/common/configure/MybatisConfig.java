package com.hgsdream.common.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * Created by Hong on 2017/7/7.
 */

/**
 * 使用configuration配置mybatis方式
 */
//@Configuration
public class MybatisConfig {
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer(){
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        mapperScannerConfigurer.setBasePackage("com.hgsdream.dao");
//        Properties properties = new Properties();
//        properties.setProperty("mappers", "com.hgsdream.common.configure.BaseDao");
//        properties.setProperty("notEmpty", "false");
//        properties.setProperty("IDENTITY", "MYSQL");
////        properties.setProperty("style", "normal");
//        properties.setProperty("style", "camelhump");
//        mapperScannerConfigurer.setProperties(properties);
//        return mapperScannerConfigurer;
//    }
}
