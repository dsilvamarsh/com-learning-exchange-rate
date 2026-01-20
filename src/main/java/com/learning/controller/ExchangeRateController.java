package com.learning.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
@Slf4j
@AllArgsConstructor
public class ExchangeRateController {

    @GetMapping(path = "/exchange-rate")
    public ResponseEntity<Map<String,String>> getExchangeRate(String fromCurrency,String toCurrency){
        return ResponseEntity.ok(Map.of("rate","1.5"));
    }

}
