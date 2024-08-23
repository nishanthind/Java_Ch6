// Program in Java to extending an interface by another interface
interface ParentInterface {
  void parentMethod();
}
interface ChildInterface extends ParentInterface {
  void childMethod();
}
class Impext implements ChildInterface{
  public void parentMethod(){
    System.out.println("Method of parent interface.");
  }
  public void childMethod(){
    System.out.println("Method of child interface.");
  }
}
class Impexintr{
  public static void main(String args[]){
    Impext ex = new Impext();
    ex.parentMethod();
    ex.childMethod();
  }
}