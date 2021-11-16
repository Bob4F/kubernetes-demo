package com.fyf.kubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fyf
 * @date 2021/11/16
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say")
    public String sayHi() {
        return "hello world";
    }

}
