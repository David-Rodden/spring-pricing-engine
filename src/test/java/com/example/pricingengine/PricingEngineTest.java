package com.example.pricingengine;

import com.example.pricingengine.service.PricingEngine;
import com.example.pricingengine.service.PromotionService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class PricingEngineTest {
    private PricingEngine pricingEngine;

    @BeforeEach
    void setUp() {
        final var objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        final var promotionService = new PromotionService(objectMapper);
        ReflectionTestUtils.invokeMethod(promotionService, "loadPromotions");
        pricingEngine = new PricingEngine(promotionService);
    }

    @Test
    void contextLoads() {
        assertNotNull(pricingEngine);
    }
}