package com.lzx.student_provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lzx.dao")
@DubboComponentScan("com.lzx.service.impl")
public class StudentProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentProviderApplication.class, args);
    }

}
