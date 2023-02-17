package com.sesame.challenge.client;

import com.sesame.challenge.dtos.ProviderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SesameAPIClient {

    public static final String SESAME_PROVIDERS_API = "https://exposed.dev.sesamecare.com/programming-challenge/v1/providers";

    private final RestTemplate restTemplate;

    public List<ProviderDto> getProviders() {
        ResponseEntity<ProviderDto[]> providers = restTemplate.getForEntity(SESAME_PROVIDERS_API, ProviderDto[].class);
        return Arrays.asList(providers.getBody());
    }
}
