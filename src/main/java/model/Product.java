package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    String name;
    BigDecimal price;

    public String getName() {
        return name;
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getFinalPrice() {
        return this.price.setScale(2, RoundingMode.HALF_UP);
    }
}
