// Program in Java to perform autoboxing.
class Autobox{
  public static void main(String args[]){
    // Autoboxing of int to Integer
    int i = 42; // int variable
    Integer j = i; // Assigning int to Integer object
    System.out.println("value of int is converted to Integer: "+j);
    // Autoboxing of double to Double
    double d = 3.14; // double variable
    Double e = d; // Assigning double to Double object
    System.out.println("value of double is converted to Double: "+e);
  }
}