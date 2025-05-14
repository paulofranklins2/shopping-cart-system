# 🛒 Shopping Cart System

A simple Java console-based Shopping Cart application with support for discounts and tax calculations. This project demonstrates object-oriented principles and use of logging with SLF4J.

## 📦 Features

- Add regular or discounted products to the cart
- Automatically apply a 10% discount to discounted products
- Compute and print receipt with:
  - Final prices
  - 21% tax rate
  - Grand total
- Logs all receipt details using SLF4J

## 🧱 Structure

```text
src/
├── model/
│   ├── Product.java             # Base product class
│   └── DiscountedProduct.java   # Product subclass with 10% discount
├── service/
│   └── ShoppingCart.java        # Manages product list and prints receipt
└── App.java                     # Main entry point
```


---

### 📄 Example Output

```text
INFO  Product: Coca Cola - $2.50
INFO  Product: Pepsi - $3.15
INFO  Total: $5.65
INFO  Tax: $1.19
INFO  Total after tax: $6.84
```


---

## 🚀 Getting Started
### Prerequisites
```
- Java 11 or higher
- SLF4J (Simple Logging Facade for Java)
```

## 💡 Future Enhancements
- Add support for different discount strategies
- Load products from a file or database
- Add unit tests
