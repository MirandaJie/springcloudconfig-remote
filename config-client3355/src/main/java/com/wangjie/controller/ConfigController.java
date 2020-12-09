package com.wangjie.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("config")
@RefreshScope //post请求刷新 http://localhost:3355/refresh
public class ConfigController {
    @Value("${config.info}")
    private String info;

    @RequestMapping("/info")
    public String getInfo() {
        return info;
    }
}