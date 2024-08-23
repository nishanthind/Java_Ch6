// Program in Java to combine multiple strings using join () method.
class JoinEx{
  public static void main(String args[]){
    String str1 = "Delhi";
    String str2 = "Mumbai";
    String str3 = "Kolkata";
    String str4 = "Chennai";
    String str = String.join(", ",str1, str2, str3, str4);
    System.out.println("Combined string is : "+str);
  }
}