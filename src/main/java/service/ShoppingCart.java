package service;

import model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private static final Logger logger = LoggerFactory.getLogger(ShoppingCart.class);
    private final List<Product> products;
    private final BigDecimal TAX_RATE = new BigDecimal("0.21");

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void printReceipt() {
        var total = BigDecimal.ZERO;

        for (Product product : products) {
            logger.info("{}: ${}", product.getName(), product.getFinalPrice());
            total = total.add(product.getFinalPrice());
        }

        var taxAmount = total.multiply(TAX_RATE).setScale(2, RoundingMode.HALF_UP);

        logger.info("Total: ${}", total);
        logger.info("Tax: ${}", taxAmount);
        logger.info("Total after tax: ${}", total.add(taxAmount)
        );
    }
}
