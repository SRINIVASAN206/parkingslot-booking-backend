package com.parkingslotbooking.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    String showhelloworld()
    {
        return "helloworld";
    }

}
