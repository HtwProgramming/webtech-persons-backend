package de.htwberlin.webtech.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/api/v1/hello")
    public String helloWorld() {
        return "Hello World";
    }

}
