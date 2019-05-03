package com.wtf.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wtf
 * @date 2019/4/18 14:49
 * @description:
 */
@RestController
public class HelloController {
    @GetMapping("getHello")
    public String getHello(){
        return "helllo1";
    }

}
