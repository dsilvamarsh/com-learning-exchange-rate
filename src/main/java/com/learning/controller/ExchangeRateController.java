package com.learning.controller;

import com.learning.respostiory.ExchangeRateRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
@Slf4j
@RequiredArgsConstructor
public class ExchangeRateController {

    //private final ExchangeRateRepository repo;
    @GetMapping(path = "/rate")
    public ResponseEntity<Map<String,String>> getExchangeRate(String fromCurrency,String toCurrency){
        log.debug("Fetching records for From {} to {} currency ",fromCurrency,toCurrency);
        return ResponseEntity.ok(Map.of("rate","1.5"));
    }

}
