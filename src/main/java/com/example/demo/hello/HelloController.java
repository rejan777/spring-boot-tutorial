package com.example.demo.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/hello")
public class HelloController {

    @GetMapping
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return "Hello " + name + "!";
    }
}
