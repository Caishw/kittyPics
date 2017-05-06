package com.github.kittypics.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by aishu on 6/05/2017.
 */
@SpringBootApplication
@Import(MainConfiguration.class)
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
