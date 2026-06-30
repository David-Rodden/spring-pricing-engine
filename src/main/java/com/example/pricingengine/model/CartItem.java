package com.example.pricingengine.model;

import java.math.BigDecimal;

/**
 * @param sku      unique product identifier
 * @param name     display name
 * @param category product category
 * @param price    unit price
 * @param quantity number of units
 */
public record CartItem(String sku, String name, Category category, BigDecimal price, int quantity) {
    public BigDecimal lineTotal() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }
}