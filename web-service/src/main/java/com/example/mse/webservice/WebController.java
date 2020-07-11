package com.example.mse.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;

import java.util.logging.Logger;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class WebController {

    Logger log = Logger.getLogger(WebController.class.getName());
    @Autowired
    GreetingService greetingService;

    @Autowired
    NameService nameService;

    @RequestMapping(value = "/", method = GET)
    String getMessage(HttpServletRequest request){
        String locale= RequestContextUtils.getLocaleResolver(request).resolveLocale(request).getLanguage();
        String name = nameService.getName();
        String greeting = greetingService.getGreeting(locale);
        log.info("received name is " + name);
        log.info("received greeting is " + greeting);
        return new StringBuilder().append(greeting).append(" ").append(name).toString();
    }


}
