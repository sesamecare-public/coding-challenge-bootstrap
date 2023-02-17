package com.sesame.challenge.services;

import com.sesame.challenge.client.SesameAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProviderService {

    private final SesameAPIClient sesameAPIClient;

    public String getHelloWorld() {
        return "Hello World";
    }
}
