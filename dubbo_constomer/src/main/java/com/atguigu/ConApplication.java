package com.atguigu;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author WZhaokang
 * @date 2020/11/23 18:28
 */
@EnableDubbo  //开启dubbo扫描
@SpringBootApplication
public class ConApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConApplication.class);
    }
}
