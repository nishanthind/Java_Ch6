// Program in Java to use getChars() for multiple character extraction from a string.
public class GetCharsEx {
  public static void main(String[] args) {
    String str = "Welcome to EduWe";
    int startIndex = 5;
    int endIndex = 11;
    char[] dstArray = new char[endIndex - startIndex];
    str.getChars(startIndex, endIndex, dstArray, 0);
    System.out.println("Extracted characters: " + new String(dstArray));
  }
}