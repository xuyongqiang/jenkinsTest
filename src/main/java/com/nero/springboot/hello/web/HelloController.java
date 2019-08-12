package com.nero.springboot.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nero.xu on 2019/8/12.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String hi(){
        return "Congratulations! It works!";
    }
}