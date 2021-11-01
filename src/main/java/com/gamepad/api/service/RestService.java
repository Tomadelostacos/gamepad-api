package com.gamepad.api.service;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {

    String baseUrl = "https://www.giantbomb.com/api/";
    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String getPostsPlainJSON() {
        String url = "https://www.giantbomb.com/api/games/?api_key=b2afa12bee9aa7cf84f5ec1b028c29240337d7e7";
        return this.restTemplate.getForObject(url, String.class);
    }
}
