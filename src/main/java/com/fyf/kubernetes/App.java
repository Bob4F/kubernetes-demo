package com.fyf.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author fyf
 * @date 2021/11/16
 */
@SpringBootApplication(scanBasePackages = "com.fyf")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
