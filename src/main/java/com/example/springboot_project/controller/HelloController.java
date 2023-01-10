package com.example.springboot_project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//用restcontroller的话 不需要用responsebody
@RestController
public class HelloController {
    //映射功能
    @RequestMapping("hello")
    //@ResponseBody()

    public String hello() {
        return "hello World ~~";
    }
}
