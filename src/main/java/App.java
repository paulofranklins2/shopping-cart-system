import model.Product;
import model.DiscountedProduct;
import service.ShoppingCart;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(new Product("Coca Cola", new BigDecimal("2.50")));
        shoppingCart.addProduct(new DiscountedProduct("Pepsi", new BigDecimal("3.50")));
        shoppingCart.printReceipt();
    }
}
