package com._SpringApp.springboot.demo.PriceChartApp.service;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class BinanceService {

    private final WebClient webClient;

    public BinanceService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://api.binance.com").build();
    }

    public Mono<List<List<Object>>> getBTCUSDTPriceData() {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/api/v3/klines")
                        .queryParam("symbol", "BTCUSDT")
                        .queryParam("interval", "1d")
                        .queryParam("limit", "30") // Fetch the last 30 days of data
                        .build())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<List<Object>>>() {});
    }
}