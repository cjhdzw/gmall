package com.study.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDubbo
@MapperScan(basePackages = "com.study.gmall.user.mapper")
@SpringBootApplication
public class GmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserServiceApplication.class, args);
    }

}
