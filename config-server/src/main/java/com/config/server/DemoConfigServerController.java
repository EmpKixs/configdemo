package com.config.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config-server")
public class DemoConfigServerController {

    @Autowired
    private Environment environment;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Environment getEnvironment() {
        return environment;
    }
}
