# Pricing Engine

Spring Boot app for applying promotions to a shopping cart.

## Setup

```bash
git clone https://github.com/David-Rodden/spring-pricing-engine.git
cd spring-pricing-engine
./mvnw spring-boot:run
```

Then check `GET http://localhost:8080/api/promotions` to see active promotions. You can also pass a date param like `?date=2026-07-01` to see promotions active on that day.

## Your Task

Implement the two methods in `PricingEngine.java`. See `Promotion.java` and `PromotionType.java` for how promotions work.

### Question 1: `calculateTotal`

Given a cart of items, calculate the final total after applying all applicable promotions. You need to handle:

- The `stackable` flag (non-stackable promotions cannot combine with others)
- The `minimumOrderValue` threshold (promotion only applies if cart subtotal meets it)
- The `appliesTo` field (targets a specific SKU, category, or null for cart-wide)
- All four promotion types: PERCENT_OFF, FLAT_DISCOUNT, BUY_ONE_GET_ONE, CATEGORY_DISCOUNT

Use whatever design patterns feel natural here to keep the logic clean and extensible.

### Question 2: `calculateBestTotal`

Find the optimal combination of promotions that gives the customer the lowest possible total. You should evaluate all valid combinations of stackable promotions and compare against each non-stackable promotion applied on its own.

Return a `PricingResult` (you will need to create this) containing:
- The final total
- The Collection of promotions that were applied
- The savings amount

This lets the caller show the customer what they saved and why.

## Testing Your Implementation

Once you implement the methods, go to http://localhost:8080 to test with the UI. You can add products to your cart, calculate totals, and view active promotions.

You can also run `./mvnw test` to run the test suite.
