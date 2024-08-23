//Program in Java for using Scanner class of java.util package without importing them.
class Packageimp2 {
  public static void main(String[] args) {
    //Using scanner class by fully qualifying it.
    java.util.Scanner sc = new java.util.Scanner(System.in);  
    System.out.print("Enter a message : "); 
    String msg = sc.nextLine(); 
    System.out.println("Your message is : "+msg);
  }
}