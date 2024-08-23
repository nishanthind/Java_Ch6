// Program in Java for implementing an interface through a class.
interface Myinterface1{
  void IntrMeth1();
}
interface Myinterface2{
  void IntrMeth2();
}
class Implementer1 implements Myinterface1,Myinterface2{
  public void IntrMeth1(){
    System.out.println("Method of first interface implemented in the class.");
  }
  public void IntrMeth2(){
    System.out.println("Method of second interface implemented in the class.");
  }
  public static void main(String args[]){
    System.out.println("Accessing Constant field of interface through interface name:: "+Myinterface.intrconst);
    System.out.println("Accessing Constant field of interface through class name:: "+Implementer1.intrconst);
    // class type reference variable to hold the reference of object.
    Implementer1 im = new Implementer1();
    im.IntrMeth();
    // Interface type reference variable to hold the reference of object.
    Myinterface1 mi = new Implementer1();
    mi.IntrMeth();
  }
}