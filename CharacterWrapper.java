// Program in Java to use Character class constructors and methods.
class CharacterWrapper{
  public static void main(String args[]){
    // Character Constructors
    Character b = new Character((char) 100);
    System.out.println("Character object value initialized through char: "+b);
    // Character class Methods
    char d = b.charValue();
    int res = b.compareTo((char) 55);
    Character e = Character.valueOf((char) 48);
    System.out.println("Character object converted to char: "+d);
    System.out.println("Character objects compared Numerically: "+res);
    System.out.println("char value converted to Character object: "+e);
  }
}
/*
Output:
Character object value initialized through char: d
Character object converted to char: d
Character objects compared Numerically: 45
char value converted to Character object: 0
*/