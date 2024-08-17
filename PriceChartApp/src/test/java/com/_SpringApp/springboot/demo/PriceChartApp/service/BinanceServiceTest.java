package com._SpringApp.springboot.demo.PriceChartApp.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@SpringBootTest
@Deprecated
public class BinanceServiceTest {

//    @Test
//    void testGetBTCUSDTPriceData() {
//        // Mock WebClient and its components
//        WebClient webClient = mock(WebClient.class);
//        WebClient.RequestHeadersUriSpec<?> requestHeadersUriSpec = mock(WebClient.RequestHeadersUriSpec.class);
//        WebClient.RequestHeadersSpec<?> requestHeadersSpec = mock(WebClient.RequestHeadersSpec.class);
//        WebClient.ResponseSpec responseSpec = mock(WebClient.ResponseSpec.class);
//
//        // Define the expected response
//        List<List<Object>> expectedResponse = List.of(
//                List.of(1609459200000L, "29000", "30000", "28000", "29500", "12345")
//        );
//
//        // Configure mocks
//        when(webClient.get()).thenReturn(requestHeadersUriSpec);
//        when(requestHeadersUriSpec.uri(anyString())).thenReturn(requestHeadersUriSpec);
//        when(requestHeadersUriSpec.retrieve()).thenReturn(responseSpec);
//        when(responseSpec.bodyToMono(any())).thenReturn(Mono.just(expectedResponse));
//
//        // Instantiate the service with the mocked WebClient
//        BinanceService binanceService = new BinanceService(webClient);
//
//        // Verify the result
//        StepVerifier.create(binanceService.getBTCUSDTPriceData())
//                .expectNext(expectedResponse)
//                .verifyComplete();
//    }
}
