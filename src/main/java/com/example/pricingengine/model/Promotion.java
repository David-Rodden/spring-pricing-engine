package com.example.pricingengine.model;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @param id                unique promotion identifier
 * @param type              the promotion type
 * @param description       human-readable description
 * @param value             percentage or dollar amount (null for BOGO)
 * @param appliesTo         SKU, category name, or null for cart-wide
 * @param minimumOrderValue cart subtotal threshold to activate (null = no minimum)
 * @param stackable         true if can combine with other stackable promotions
 * @param startDate         first day the promotion is active (inclusive)
 * @param endDate           last day the promotion is active (inclusive)
 */
public record Promotion(String id, PromotionType type, String description, BigDecimal value, String appliesTo, BigDecimal minimumOrderValue, boolean stackable, LocalDate startDate, LocalDate endDate) {
}