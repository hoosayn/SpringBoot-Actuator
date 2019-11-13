package com.boot.actuator.bootactuator.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {

    @Value(value="${custom.message}") private String message;

    public String index(){
        return "index";
    }

    @RequestMapping("message")
    @ResponseBody
    public String getMessage(){
        return message;
    }
}
