// Program in Java for implementing multiple interface in a class.
// First Interface
interface Myinterface1{
  void IntrMeth1();
}
// Second Interface
interface Myinterface2{
  void IntrMeth2();
}
class Multimpl implements Myinterface1,Myinterface2{
  // Implementing method of first interface
  public void IntrMeth1(){
    System.out.println("Method of first interface implemented in the class.");
  }
  // Implementing method of second interface
  public void IntrMeth2(){
    System.out.println("Method of second interface implemented in the class.");
  }
  public static void main(String args[]){
    Multimpl mi = new Multimpl();
    mi.IntrMeth1(); // Calling method of first interface
    mi.IntrMeth2(); // Calling method of second interface
  }
}