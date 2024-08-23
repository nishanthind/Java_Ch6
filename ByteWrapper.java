// Program in Java to use Byte class constructors and methods.
class ByteWrapper{
  public static void main(String args[]){
    // Byte Constructors
    Byte b = new Byte((byte) 10);
    Byte c = new Byte("100");
    System.out.println("Byte object value initialized through byte: "+b);
    System.out.println("Byte object value initialized through string: "+c);
    // Byte class Methods
    byte d = b.byteValue();
    int res = b.compareTo((byte) -15);
    int res1 = b.compareUnsigned(b,(byte) -15);
    Byte e = Byte.valueOf((byte) 20);
    System.out.println("Byte object converted to byte: "+d);
    System.out.println("Byte objects compared Numerically: "+res);
    System.out.println("Byte objects compared Numerically as unsigned: "+res1);
    System.out.println("byte value converted to Byte object: "+e);
  }
}
/*
Output:
Byte object value initialized through byte: 10
Byte object value initialized through string: 100
Byte object converted to byte: 10
Byte objects compared Numerically: 25
Byte objects compared Numerically as unsigned: -231
byte value converted to Byte object: 20
*/