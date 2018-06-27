package com.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoTestController {

    @Value("${from}")
    private String from;

    @Autowired
    private Environment env;

    @RequestMapping("from")
    public String from() {
        System.out.println(from);
        return from;
    }

    @RequestMapping("from-env")
    public String fromEnv() {
        System.out.println(env.getProperty("from", "undefined"));
        return env.getProperty("from", "undefined");
    }
}
