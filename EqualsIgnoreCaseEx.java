// Program in Java to compare two strings for equality ignoring cases using equalsIgnoreCase().
public class EqualsIgnoreCaseEx {
  public static void main(String[] args) {
    String str1 = "EduWe";
    String str2 = "EduWe";
    String str3 = "eduwe";
    boolean result1 = str1.equalsIgnoreCase(str2);
    boolean result2 = str1.equalsIgnoreCase(str3);
    System.out.println("str1 and str2 are equal: " + result1);
    System.out.println("str1 and str3 are equal ignoring case: " + result2);
  }
}
