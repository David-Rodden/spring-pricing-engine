package com.example.pricingengine.service;

import com.example.pricingengine.model.CartItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;

@Service
@RequiredArgsConstructor
public class PricingEngine {
    private final PromotionService promotionService;

    /**
     * Question 1: Given an API that returns active promotions (see GET /api/promotions),
     * calculate the final cart total after applying all applicable promotions.
     * <p>
     * Make sure to respect the stackable flag (non-stackable promos can't combine),
     * the minimumOrderValue threshold, and the appliesTo targeting (SKU or category).
     * Handle all promotion types: PERCENT_OFF, FLAT_DISCOUNT, BUY_ONE_GET_ONE, CATEGORY_DISCOUNT.
     * <p>
     * Use whatever design patterns feel natural here to keep the logic clean and extensible.
     */
    public BigDecimal calculateTotal(final Collection<CartItem> cart) {
        // TODO: implement
        throw new UnsupportedOperationException("Not implemented");
    }

    /**
     * Question 2: Find the optimal combination of promotions that minimizes the cart total.
     * <p>
     * Evaluate all valid combinations of stackable promotions, compare against each
     * non-stackable promotion applied individually, and return whichever yields the lowest total.
     * <p>
     * Return a PricingResult (you'll need to create this) containing the final total,
     * the Collection of promotions that were applied, and the savings amount. This lets the
     * caller show the customer what they saved and why.
     */
    public BigDecimal calculateBestTotal(final Collection<CartItem> cart) {
        // TODO: implement
        throw new UnsupportedOperationException("Not implemented");
    }
}