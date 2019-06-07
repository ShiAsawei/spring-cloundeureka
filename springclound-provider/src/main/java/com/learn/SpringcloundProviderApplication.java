package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//@ComponentScan(basePackages = {"com.learn.entity","com.learn.springcloundapi.entity"})
public class SpringcloundProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloundProviderApplication.class, args);
    }

}
