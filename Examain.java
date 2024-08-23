abstract class Exa{
  int a;
  Exa(){
    a = 10;
  }
  abstract void printnum();
}
class Exas extends Exa{
  void printnum(){
    System.out.println("number is "+a);
  }
}
class Examain{
  public static void main(String args[]){
    Exas ex = new Exas();
    ex.printnum();
  }
}