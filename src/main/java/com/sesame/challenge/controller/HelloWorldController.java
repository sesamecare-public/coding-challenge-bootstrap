package com.sesame.challenge.controller;

import com.sesame.challenge.services.ProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloWorldController {

    private final ProviderService providerService;

    @GetMapping("/")
    public String hello() {
        return providerService.getHelloWorld();
    }
}
