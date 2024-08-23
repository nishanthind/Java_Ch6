// Product.java
interface Product {
    double getPrice();
    int getQuantity();
}
// Taxable.java
interface Taxable {
    double getSalesTax();
}
// Discountable.java
interface Discountable {
    double getDiscountedPrice();
}
// Book.java
class Book implements Taxable, Product {
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
class Clothing implements Taxable, Discountable, Product {
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
// Electronics.java
class Electronics implements Discountable, Product {
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
public class ShoppingCart {
    public static void main(String[] args) {
        Book book = new Book( 10.99, 1);
        Clothing clothing = new Clothing(19.99, 2);
        Electronics electronics = new Electronics(59.99, 1);
        double total = 0.0;
        // Add the price of each product to the total
        total += book.getPrice() * book.getQuantity();
        total += clothing.getPrice() * clothing.getQuantity();
        total += electronics.getPrice() * electronics.getQuantity();
        // Add the sales tax for taxable products
        if (book instanceof Taxable) {
            total += ((Taxable) book).getSalesTax() * book.getQuantity();
        }
        if (clothing instanceof Taxable) {
            total += ((Taxable) clothing).getSalesTax() * clothing.getQuantity();
        }
        if (electronics instanceof Taxable) {
            total += ((Taxable) electronics).getSalesTax() * electronics.getQuantity();
        }
        // Subtract the discount for discountable products
        if (book instanceof Discountable) {
            total -= ((Discountable) book).getDiscountedPrice() * book.getQuantity();
        }
        if (clothing instanceof Discountable) {
            total -= ((Discountable) clothing).getDiscountedPrice() * clothing.getQuantity();
        }
        if (electronics instanceof Discountable) {
            total -= ((Discountable) electronics).getDiscountedPrice() * electronics.getQuantity();
        }
        System.out.println("Total price: $" + total);
    }
}