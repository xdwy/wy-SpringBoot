package com.wy.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangmin
 * @create 2023-07-10 15:00
 */
@RestController
public class UserController {

    @GetMapping("/test")
    public String test(){
        return "wy123123";
    }
}
