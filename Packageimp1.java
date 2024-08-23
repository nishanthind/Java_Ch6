//Program in Java for importing complete java.util package.
import java.util.*; // Importing the complete package  
class Packageimp1 {
  public static void main(String[] args) {
    //Creating an object of scanner class
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter a message : "); 
    // Reading the input from user and storing it in message variable
    String msg = sc.nextLine(); 
    System.out.println("Your message is : "+msg);
  }
}