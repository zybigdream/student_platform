package com.lzx.clas_provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lzx.dao")
@DubboComponentScan("com.qf.service.impl")
public class ClasProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClasProviderApplication.class, args);
    }

}
