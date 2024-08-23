// Program in Java to use Double class constructors and methods.
class DoubleWrapper{
  public static void main(String args[]){
    // Double Constructors
    Double b = new Double((double) 10.23456);
    Double c = new Double("100.25");
    System.out.println("Double object value initialized through double: "+b);
    System.out.println("Double object value initialized through string: "+c);
    // Double class Methods
    double d = b.doubleValue();
    int res = b.compareTo((double) -15.45);
    Double e = Double.valueOf((double) 20.78);
    System.out.println("Double object converted to double: "+d);
    System.out.println("Double objects compared Numerically: "+res);
    System.out.println("double value converted to Double object: "+e);
  }
}
/*
Output:
Double object value initialized through double: 10.23456
Double object value initialized through string: 100.25
Double object converted to double: 10.23456
Double objects compared Numerically: 1
double value converted to Double object: 20.78
*/