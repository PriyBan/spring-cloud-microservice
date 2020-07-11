package com.example.mse.nameservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class NameController {

    Logger log = Logger.getLogger(NameController.class.getName());
    @Autowired
    NameProperties nameProperties;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String getName(){
        String name = nameProperties.getName();
        log.info("Name is " + name);
        return name;
    }
}
