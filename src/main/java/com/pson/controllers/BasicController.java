package com.pson.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    //pod adresem localhost:8080/dupa bedzie widac hello world
    @RequestMapping(value = "/dupa",produces = "application/json")
    String home() {
        return "Hello World!";
    }

}
