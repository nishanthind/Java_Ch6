// Program in Java to use toCharArray() for character extraction from a string into an array.
public class TochrArrEx {
  public static void main(String[] args) {
    String str = "EduWe";
    char[] charArray = str.toCharArray();
    for (char c : charArray) {
      System.out.println(c);
    }
  }
}