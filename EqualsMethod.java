// Program in Java to compare two strings for equality using equals().
public class EqualsMethod {
  public static void main(String[] args) {
    String str1 = "EduWe";
    String str2 = "EduWe";
    String str3 = "EDUWE";
    System.out.println("str1 and str2 are equal: " + str1.equals(str2));
    System.out.println("str1 and str3 are not equal: " + str1.equals(str3));
  }
}
