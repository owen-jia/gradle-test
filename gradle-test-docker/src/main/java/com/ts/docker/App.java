package com.ts.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Owen Jia
 * @time: 2019/3/26 10:43
 */
@SpringBootApplication
public class App {

    public static void main(String[] args){
        System.out.println("hello,i am gradle-test-docker");
        SpringApplication.run(App.class,args);
    }
}
