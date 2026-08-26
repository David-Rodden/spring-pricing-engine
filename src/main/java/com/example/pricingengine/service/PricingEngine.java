package com.example.pricingengine.service;

import com.example.pricingengine.model.CartItem;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Collection;

@Service
public class PricingEngine {
    private final PromotionService promotionService;

    public PricingEngine(final PromotionService promotionService) {
        this.promotionService = promotionService;
    }

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
     * Question 2: Find the combination of promotions that minimizes the cart total.
     * <p>
     * One rule changes from Question 1: minimumOrderValue is now checked against the
     * running total rather than the subtotal. Applying one discount can therefore drop
     * the cart below another promotion's threshold and cost you a bigger saving, so
     * applying every stackable promotion is no longer guaranteed to be cheapest.
     * <p>
     * Return a PricingResult (you'll need to create it) containing the final total, the
     * promotions that were applied, and the savings versus the subtotal. This lets the
     * caller show the customer what they saved and why.
     */
    public BigDecimal calculateBestTotal(final Collection<CartItem> cart) {
        // TODO: implement
        throw new UnsupportedOperationException("Not implemented");
    }
}