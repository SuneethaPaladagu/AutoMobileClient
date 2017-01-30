package com.nisum;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RefreshScope
@Component
public class ExampleController {
	
	
    @Value("${msgnew}")
    private String name;
    
    @RequestMapping(value = "/cloud")
    public String cloudmsg() {
       
        return name;
    }

}
