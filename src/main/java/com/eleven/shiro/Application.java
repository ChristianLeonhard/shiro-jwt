package com.eleven.shiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication //复合注解（@ComponentScan、@SpringBootConfiguration、@EnableAutoConfiguration）
@EnableConfigurationProperties //让使用 @ConfigurationProperties 注解的类生效。
@EnableTransactionManagement //开启事务支持，搭配在访问数据库的Service方法上添加注解 @Transactional。
@EnableCaching //Spring Cache 缓存
public class Application extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}

