// Program in Java to use Short class constructors and methods.
class ShortWrapper{
  public static void main(String args[]){
    // Short Constructors
    Short b = new Short((short) 10);
    Short c = new Short("100");
    System.out.println("Short object value initialized through short: "+b);
    System.out.println("Short object value initialized through string: "+c);
    // Short class Methods
    short d = b.shortValue();
    int res = b.compareTo((short) -15);
    int res1 = b.compareUnsigned(b, (short)-15);
    Short e = Short.valueOf((short) 20);
    System.out.println("Short object converted to short: "+d);
    System.out.println("Short objects compared Numerically: "+res);
    System.out.println("Short objects compared Numerically as unsigned: "+res1);
    System.out.println("short value converted to Short object: "+e);
  }
}
/*
Output:
Short object value initialized through short: 10
Short object value initialized through string: 100
Short object converted to short: 10
Short objects compared Numerically: 25
Short objects compared Numerically as unsigned: -65511
short value converted to Short object: 20
*/