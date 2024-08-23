// Program in Java to use getBytes() for byte extraction from a string into an array.
public class GetByteArr {
  public static void main(String[] args) {
    String str = "EduWe";
    byte[] byteArray = str.getBytes();
    for (byte b : byteArray) {
      System.out.println(b);
    }
  }
}
