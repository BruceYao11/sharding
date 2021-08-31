package com.test.sharding.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: yaoji
 * @date: 2021/8/25 13:54
 * @description:
 */
//@Configuration
//@EnableTransactionManagement
public class TransactionConfig {

//    @Bean
//    public PlatformTransactionManager txManager(final DataSource dataSource) {
//        return new DataSourceTransactionManager(dataSource);
//    }
//
//    @Bean
//    public JdbcTemplate jdbcTemplate(final DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
}