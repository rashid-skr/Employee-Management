package com.IUStudents.Begin.Project.Controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   @GetMapping("/")
    public String helloworld() {
        return "I am Rashid!!.I am learning Spring Boot Project and I am tring to my best ";
    }
}