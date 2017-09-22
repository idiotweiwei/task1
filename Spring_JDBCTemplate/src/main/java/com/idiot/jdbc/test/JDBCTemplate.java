package com.idiot.jdbc.test;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JDBCTemplate {
        @Test
        public void demo(){
            DriverManagerDataSource dataSource=new DriverManagerDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://sql_conn");
            dataSource.setUsername("root");
            dataSource.setPassword("guoweijie");
            JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
            jdbcTemplate.execute("CREATE TABLE temp_add(`id` int(11) NOT NULL," +
                    "`name` varchar(32) DEFAULT NULL,`password` varchar(32) DEFAULT NULL,PRIMARY KEY (`id`))");
        }
    }
