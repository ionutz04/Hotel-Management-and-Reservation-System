package com.iground.eu.facultate.HMR;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HmrController {
    @GetMapping("/health")
    public String hello(){
        return "Hello World!";
    }
}
