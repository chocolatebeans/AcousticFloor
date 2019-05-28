package com.alban.api.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/api")
public class DemoApi {

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String hello(){
        return "Hello api! ";
    }

}
