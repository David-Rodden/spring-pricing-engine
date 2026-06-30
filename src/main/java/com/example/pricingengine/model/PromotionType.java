package com.example.pricingengine.model;

/**
 * PERCENT_OFF     - percentage off the cart total (or matching items if appliesTo is set)
 * FLAT_DISCOUNT   - fixed dollar amount off the cart total
 * BUY_ONE_GET_ONE - buy one get one free for items matching appliesTo SKU; value is null (discount is implicit: for every 2 items, charge for 1)
 * CATEGORY_DISCOUNT - percentage off items in the category specified by appliesTo
 */
public enum PromotionType {
    PERCENT_OFF, FLAT_DISCOUNT, BUY_ONE_GET_ONE, CATEGORY_DISCOUNT
}