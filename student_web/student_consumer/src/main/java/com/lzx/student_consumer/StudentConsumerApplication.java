package com.lzx.student_consumer;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.lzx")

public class StudentConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentConsumerApplication.class, args);
    }

}
