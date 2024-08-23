// Program in Java to define a static method with implementation inside interface.
interface MyInterface {
  // Static Method 
  static void smeth() {
    System.out.println ("Static method defined inside an interface.");
  }
}
class Statintr implements MyInterface{
    public static void main(String[] args) {
        Statintr.smeth(); // Calling static method      
    }
}

