package com.example.pricingengine.controller;

import com.example.pricingengine.model.CartItem;
import com.example.pricingengine.service.PricingEngine;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/api/pricing")
@RequiredArgsConstructor
public class PricingController {
    private final PricingEngine pricingEngine;

    @PostMapping("/calculate")
    public Map<String, BigDecimal> calculate(@RequestBody final Collection<CartItem> cart) {
        return Map.of("total", pricingEngine.calculateTotal(cart));
    }

    @PostMapping("/calculate-best")
    public Map<String, BigDecimal> calculateBest(@RequestBody final Collection<CartItem> cart) {
        return Map.of("bestTotal", pricingEngine.calculateBestTotal(cart));
    }
}