// Program in Java to replace character and portion of a string using replace().
class ReplaceEx{
  public static void main(String args[]){
    String str = "Hello, World";
    str = str.replace('o', '0');
    System.out.println(str);
    String str2 = "Good Morning";
    str2 = str2.replace("Mor", "Eve");
    System.out.println(str2);
    String str3 = "Hello World";
    System.out.println(str3.indexOf("l"));
  }
}
