package com.lyhm.lyhmaicode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class LyhmAiCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyhmAiCodeApplication.class, args);
    }

}
