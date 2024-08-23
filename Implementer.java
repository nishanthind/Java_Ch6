// Program in Java for implementing an interface through a class.
class Implementer implements Myinterface{
  // Implementing abstract method of interface
  public void IntrMeth(){
    System.out.println("Method implemented in the class.");
  }
  public static void main(String args[]){
    // Accessing constant field of interface through interface name.
    System.out.println("Constant field of interface:: "+Myinterface.intrconst);
    Implementer im = new Implementer();
    im.IntrMeth();
  }
}