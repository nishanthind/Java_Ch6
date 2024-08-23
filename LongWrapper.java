// Program in Java to use Long class constructors and methods.
class LongWrapper{
  public static void main(String args[]){
    // Long Constructors
    Long b = new Long((long) 10);
    Long c = new Long("100");
    System.out.println("Long object value initialized through long: "+b);
    System.out.println("Long object value initialized through string: "+c);
    // Long class Methods
    long d = b.longValue();
    int res = b.compareTo((long) -15);
    int res1 = b.compareUnsigned(b,(long) -15);
    Long e = Long.valueOf((long)20);
    System.out.println("Long object converted to long: "+d);
    System.out.println("Long objects compared Numerically: "+res);
    System.out.println("Long objects compared Numerically as unsigned: "+res1);
    System.out.println("long value converted to Long object: "+e);
  }
}
/*
Output:
Long object value initialized through long: 10
Long object value initialized through string: 100
Long object converted to long: 10
Long objects compared Numerically: 1
Long objects compared Numerically as unsigned: -1
long value converted to Long object: 20
*/