package com._SpringApp.springboot.demo.PriceChartApp.controller;

import com._SpringApp.springboot.demo.PriceChartApp.service.BinanceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@WebFluxTest(ChartController.class)
public class ChartControllerTest {

    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private BinanceService binanceService;

    @Test
    void testGetBTCUSDTPriceData() {
        // Define the expected response
        List<List<Object>> expectedResponse = List.of(
                List.of("timestamp", "open", "high", "low", "close", "volume"),
                List.of(1609459200000L, "29000", "30000", "28000", "29500", "12345")
        );

        // Mock the BinanceService behavior
        when(binanceService.getBTCUSDTPriceData()).thenReturn(Mono.just(expectedResponse));

        // Perform the request and verify the response
        webTestClient.get().uri("/api/chart/btc-usdt")
                .exchange()
                .expectStatus().isOk()
                .expectBody()
                .jsonPath("$[0][0]").isEqualTo("timestamp")
                .jsonPath("$[1][0]").isEqualTo(1609459200000L)
                .jsonPath("$[1][4]").isEqualTo("29500");
    }
}
