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

Implement `calculateTotal` in `PricingEngine.java`: given a cart, return the final total after applying promotions.

### Details

Start with `Promotion.java` and `PromotionType.java` for how promotions work, and `GET /api/promotions` for the live data. A promotion only counts if it's active today. You need to handle:

- All four promotion types: PERCENT_OFF, FLAT_DISCOUNT, BUY_ONE_GET_ONE, CATEGORY_DISCOUNT
- The `appliesTo` field (a specific SKU, a category, or null for cart-wide) only applies if the cart contains a match
- The `minimumOrderValue` threshold - only applies if the subtotal meets it, where subtotal is the sum of `price * quantity` before any discount
- The `stackable` flag (non-stackable promotions can't combine with anything) - the total is the lower of: all applicable stackable promotions together, or each non-stackable promotion on its own

Every discount is computed off the subtotal and the original line totals, so application order doesn't matter. The total never goes below $0.

Use whatever design patterns feel natural here to keep the logic clean and extensible.

Once you implement the method, go to http://localhost:8080 to test with the UI. You can add products to your cart, calculate totals, and view active promotions. You can also run `mvn test`.
