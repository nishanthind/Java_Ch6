// Program in Java to use Boolean class constructors and methods.
class BooleanWrapper{
  public static void main(String args[]){
    // Boolean Constructors
    Boolean b = new Boolean((boolean) true);
    Boolean c = new Boolean("false");
    System.out.println("Boolean object value initialized through boolean: "+b);
    System.out.println("Boolean object value initialized through string: "+c);
    // Boolean class Methods
    boolean d = b.booleanValue();
    int res = b.compareTo((boolean) false);
    Boolean e = Boolean.valueOf((boolean) true);
    System.out.println("Boolean object converted to boolean: "+d);
    System.out.println("Boolean objects compared Numerically: "+res);
    System.out.println("boolean value converted to Boolean object: "+e);
  }
}
/*
Output:
Boolean object value initialized through boolean: true
Boolean object value initialized through string: false
Boolean object converted to boolean: true
Boolean objects compared Numerically: 1
boolean value converted to Boolean object: true
*/