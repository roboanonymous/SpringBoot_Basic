package com.example.Gradle_spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("home")
    public void home()
    {
        System.out.println("In Compiling");
    }
}
