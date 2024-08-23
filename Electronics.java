// Electronics.java
package shop;
import shop.*;
public class Electronics implements Discountable, Product {
    private double price;
    private int quantity;

    public Electronics(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getDiscountedPrice() {
        // Electronics are currently on sale for 15% off
        return price * 0.85;
    }
}