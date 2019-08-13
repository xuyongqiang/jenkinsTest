package com.nero.springboot.hello.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by nero.xu on 2019/8/12.
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public ModelAndView hi(){
        return "index.html";
    }
}