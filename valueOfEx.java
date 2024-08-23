// Program in Java to convert the primitive type data into a string using valueOf().
class valueOfEx{
  public static void main(String args[]){
    int num = 123;
    String inttostr = String.valueOf(num);
    System.out.println(inttostr);
    double num1 = 123.789;
    String doubletostr = String.valueOf(num1);
    System.out.println(doubletostr);
  }
}