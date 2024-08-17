package com._SpringApp.springboot.demo.PriceChartApp.controller;

import com._SpringApp.springboot.demo.PriceChartApp.service.BinanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class ChartController {

    private final BinanceService binanceService;

    public ChartController(BinanceService binanceService) {
        this.binanceService = binanceService;
    }

    @GetMapping("/api/chart/btc-usdt")
    public Mono<List<List<Object>>> getBTCUSDTPriceData() {
        return binanceService.getBTCUSDTPriceData();
    }
}

