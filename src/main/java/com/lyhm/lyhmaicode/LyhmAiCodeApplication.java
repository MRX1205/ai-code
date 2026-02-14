package com.lyhm.lyhmaicode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.lyhm.lyhmaicode.mapper")
public class LyhmAiCodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyhmAiCodeApplication.class, args);
    }

}
