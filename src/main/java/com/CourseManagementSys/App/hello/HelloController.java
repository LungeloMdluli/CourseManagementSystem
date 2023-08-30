package com.CourseManagementSys.App.hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //Here I am testing my requests.
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";
    }
}
