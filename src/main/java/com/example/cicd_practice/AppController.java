package com.example.cicd_practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/")
    public String home()
    {
        return "good, world";
    }
}
// sudo fuser -k -n tcp 8080