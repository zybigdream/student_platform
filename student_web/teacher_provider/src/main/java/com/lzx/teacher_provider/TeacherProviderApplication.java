package com.lzx.teacher_provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lzx.dao")
@DubboComponentScan("com.lzx.service.impl")
public class TeacherProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeacherProviderApplication.class, args);
    }

}
