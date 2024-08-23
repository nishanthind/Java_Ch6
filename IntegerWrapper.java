// Program in Java to use Integer class constructors and methods.
class IntegerWrapper{
  public static void main(String args[]){
    // Integer Constructors
    Integer b = new Integer((int) 10);
    Integer c = new Integer("100");
    System.out.println("Integer object value initialized through int: "+b);
    System.out.println("Integer object value initialized through string: "+c);
    // Integer class Methods
    int d = b.intValue();
    int res = b.compareTo(-15);
    int res1 = b.compareUnsigned(b,-15);
    Integer e = Integer.valueOf(20);
    System.out.println("Integer object converted to int: "+d);
    System.out.println("Integer objects compared Numerically: "+res);
    System.out.println("Integer objects compared Numerically as unsigned: "+res1);
    System.out.println("int value converted to Integer object: "+e);
  }
}
/*
Output:
Integer object value initialized through int: 10001
Integer object value initialized through string: 1000000
Integer object converted to int: 10001
Integer objects compared Numerically: 1
Integer objects compared Numerically as unsigned: -1
int value converted to Integer object: 20008
*/
