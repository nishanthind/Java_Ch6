import shop.Taxable;
import shop.Discountable;
import shop.Book;
import shop.Clothing;
import shop.Electronics;
public class ShoppingCartApp {
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