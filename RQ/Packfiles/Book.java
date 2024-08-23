// Book.java
package shop;
import shop.*;
public class Book implements Taxable, Product {
    private double price;
    private int quantity;

    public Book(double price, int quantity) {
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
        // Sales tax for books is 10%
        return 0.1 * price;
    }
}
