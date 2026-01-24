package com.parkingslotbooking.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping("/hello")
    String showhelloworld()
    {
        return "helloworld";
    }

    @GetMapping("/bye")
    String showbyeworld()
    {
        return "byeworld";
    }

}
