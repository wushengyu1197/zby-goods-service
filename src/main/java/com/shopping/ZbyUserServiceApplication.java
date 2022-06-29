package com.shopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = {"com.shopping.mapper"})
public class ZbyUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZbyUserServiceApplication.class, args);
//        		SpringApplication application=new SpringApplication(ZbyUserServiceApplication.class);
//		String env="qa";
//
//		application.setAdditionalProfiles(env);
//		application.run();
    }

}
