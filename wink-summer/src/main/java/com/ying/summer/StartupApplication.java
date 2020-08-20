package com.ying.summer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by chengying
 */
@SpringBootApplication
@MapperScan(basePackages = "com.ying.summer.mapper")
@EnableTransactionManagement(proxyTargetClass = true)
public class StartupApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartupApplication.class, args);
        System.out.println("启动成功在端口:8989");
    }
}
