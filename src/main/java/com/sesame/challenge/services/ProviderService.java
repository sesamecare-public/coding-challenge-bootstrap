package com.sesame.challenge.services;

import com.sesame.challenge.client.SesameAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {

    @Autowired
    private SesameAPIClient sesameAPIClient;

    public String getHelloWorld() {
        return "Hello World";
    }
}
