package com.sesame.challenge.client;

import com.sesame.challenge.dtos.ProviderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class SesameAPIClient {

    public static final String SESAME_PROVIDERS_API = "todo";

    @Autowired
    private RestTemplate restTemplate;

    public List<ProviderDto> getProviders() {
        ResponseEntity<ProviderDto[]> providers = restTemplate.getForEntity(SESAME_PROVIDERS_API, ProviderDto[].class);
        return Arrays.asList(providers.getBody());
    }
}
