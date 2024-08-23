// Clothing.java
package shop;
import shop.*;
public class Clothing implements Taxable, Discountable, Product {
    private double price;
    private int quantity;
    public Clothing( double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getSalesTax() {
        // Sales tax for clothing is 5%
        return 0.05 * price;
    }
    public double getDiscountedPrice() {
        // Clothing is currently on sale for 20% off
        return price * 0.8;
    }
}
