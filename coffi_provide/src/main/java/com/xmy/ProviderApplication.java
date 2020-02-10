package com.xmy;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration//识别dubbo的相关注解
@MapperScan("com.xmy.mapper")
public class ProviderApplication {

    public static void main(String[] args)  {
        SpringApplication.run(ProviderApplication.class, args);
        System.out.println("服务端启动成功！！！");

    }
}
