// Program in Java to use Float class constructors and methods.
class FloatWrapper{
  public static void main(String args[]){
    // Float Constructors
    Float b = new Float((float) 10.25);
    Float c = new Float("100.34");
    System.out.println("Float object value initialized through float: "+b);
    System.out.println("Float object value initialized through string: "+c);
    // Float class Methods
    float d = b.floatValue();
    int res = b.compareTo((float) -15.123);
    Float e = Float.valueOf((float) 20.98);
    System.out.println("Float object converted to float: "+d);
    System.out.println("Float objects compared Numerically: "+res);
    System.out.println("float value converted to Float object: "+e);
  }
}
/*
Output:
Float object value initialized through float: 10.25
Float object value initialized through string: 100.34
Float object converted to float: 10.25
Float objects compared Numerically: 1
float value converted to Float object: 20.98
*/