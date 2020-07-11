package com.example.mse.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GreetingService {

    @Autowired
    private RestTemplate restTemplate;

    private String GREETING_URL= "http://greeting";

    public String getGreeting(){
        return restTemplate.getForObject(GREETING_URL, String.class);
    }

    public String getGreeting(String lang){
        return restTemplate.getForObject(GREETING_URL+"/" + lang, String.class);
    }
}
