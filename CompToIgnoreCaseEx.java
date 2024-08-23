// Program in Java to compare two strings ignoring cases using compateToIgnoreCase().
public class CompToIgnoreCaseEx {
  public static void main(String[] args) {
    String str1 = "EduWe";
    String str2 = "eduWe";
    String str3 = "Eeuwe";
    int result1 = str1.compareToIgnoreCase(str2);
    int result2 = str1.compareToIgnoreCase(str3);
    System.out.println("Str1 is less than str2: "+result1);
    System.out.println("Str1 is less than str3: "+result2);
  }
}