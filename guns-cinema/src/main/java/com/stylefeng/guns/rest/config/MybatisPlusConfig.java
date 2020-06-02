package com.stylefeng.guns.rest.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: huruilei
 * @date: 2020/6/1
 * @description:
 * @return
 */
@Configuration
@MapperScan(basePackages = {"com.stylefeng.guns.rest.*.dao", "com.stylefeng.guns.rest.common.persistence.dao"})
public class MybatisPlusConfig {

    /**
     * mybatis-plus分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
