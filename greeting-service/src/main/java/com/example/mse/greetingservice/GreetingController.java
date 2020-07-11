package com.example.mse.greetingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.logging.Logger;

@RestController
public class GreetingController {

    Logger logger= Logger.getLogger(GreetingController.class.getName());

    @Autowired
    GreetingProperties greetingProperties;

    @RequestMapping("/")
    String getGreeting(){
        return greetingProperties.getGreeting();
    }

    @RequestMapping("/{lang}")
    String getGreetingForLanguage(@PathVariable String lang){
        logger.info("Lmaguage received " + lang);
        String greeting = greetingProperties.getGreetings().get(lang.toUpperCase());
        logger.info("Greeting is " + greetingProperties.getGreetings().get(lang.toUpperCase()));
            return greetingProperties.getGreetings().get(lang.toUpperCase());

    }
}
