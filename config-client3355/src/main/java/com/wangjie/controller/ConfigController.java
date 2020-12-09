package com.wangjie.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
public class ConfigController {
    @Value("${config.info}")
    private String info;

    @RequestMapping("/info")
    public String getInfo() {
        return info;
    }
}