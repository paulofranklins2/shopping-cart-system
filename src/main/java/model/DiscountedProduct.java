package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DiscountedProduct extends Product {
    private static final BigDecimal DISCOUNT_PERCENTAGE = new BigDecimal("0.1");

    public DiscountedProduct(String name, BigDecimal price) {
        super(name, price);
    }

    public BigDecimal getFinalPrice() {
        return this.price.subtract(this.price.multiply(DISCOUNT_PERCENTAGE)).setScale(2, RoundingMode.HALF_UP);
    }
}
