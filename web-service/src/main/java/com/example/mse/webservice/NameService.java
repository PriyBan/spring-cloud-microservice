package com.example.mse.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class NameService {

    @Autowired
    private RestTemplate restTemplate;

    private String NAME_SERVICE_URL= "http://name";

    public String getName(){
        return restTemplate.getForObject(NAME_SERVICE_URL, String.class);
    }

}
