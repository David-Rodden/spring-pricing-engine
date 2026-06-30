package com.example.pricingengine.service;

import com.example.pricingengine.model.Promotion;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PromotionService {
    private final ObjectMapper objectMapper;
    private Collection<Promotion> allPromotions = List.of();

    @PostConstruct
    void loadPromotions() throws IOException {
        allPromotions = objectMapper.readValue(new ClassPathResource("promotions.json").getInputStream(), new TypeReference<>() {
        });
    }

    /**
     * Returns promotions active on the given date.
     */
    public Collection<Promotion> getActivePromotions(final LocalDate date) {
        return allPromotions.stream().filter(p -> !date.isBefore(p.startDate()) && !date.isAfter(p.endDate())).toList();
    }

    /**
     * Returns promotions active today.
     */
    public Collection<Promotion> getActivePromotions() {
        return getActivePromotions(LocalDate.now());
    }
}