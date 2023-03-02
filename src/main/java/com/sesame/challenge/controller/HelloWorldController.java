package com.sesame.challenge.controller;

import com.sesame.challenge.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private ProviderService providerService;

    @GetMapping("/")
    public String hello() {
        return providerService.getHelloWorld();
    }
}
