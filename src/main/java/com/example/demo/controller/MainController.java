package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(value ="/welcome",method= RequestMethod.GET)
    public String welcome(){return "Welcome NSBM";}

    @RequestMapping(value="/welcomepost", method=RequestMethod.POST)
    public String welcomePost(){return "Welcome NSBM From Post";}
}
