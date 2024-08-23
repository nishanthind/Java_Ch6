// Program in Java to remove leading and trailing whitespace from the original string using trim and strip.
public class TrimStrip {
  public static void main(String[] args) {
    String str = "   EduWe!!   ";
    String str1 = str.trim();
    String str2 = str.strip();
    System.out.println("Original String: " + str);
    System.out.println("Trimmed String: " + str1);
    System.out.println("Stripped String: " + str2);
  }
}
