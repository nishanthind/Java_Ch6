// Program in Java to define and initialize a string.
class Strmain{
  public static void main(String args[]){
    String str = "EduWe"; // String Literal
    System.out.println("Through Literals: "+str);
    String strg = new String(); // Empty String
    System.out.println("Empty String: "+strg);
    char [ ] chrarray = {'E', 'd', 'u', 'W', 'e'};
    String str1 = new String (chrarray); // character Array
    System.out.println("Through char array: "+str1);
    String str2 = new String (chrarray, 0, 3); // Portion of Character Array
    System.out.println("Through portion of char array: "+str2);
    byte [ ] bytarray = {69, 100, 117, 119, 101};
    String str3 = new String (bytarray); // byte Array
    System.out.println("Through byte array: "+str3);
    String str4 = new String (bytarray,0,3); // Portion of byte Array
    System.out.println("Through portion of byte array: "+str4);
    String str5 = new String (str1); // String object
    System.out.println("Through string object: "+str5);
  }
}