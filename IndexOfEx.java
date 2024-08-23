// Program in Java to demonstrate the use of indexOf() method with different forms.
public class IndexOfEx {
  public static void main(String[] args) {
    String str = "EduWe Technology";
    System.out.println("Index of e: " + str.indexOf('e'));
    System.out.println("Index of e after index 5: " + str.indexOf('e', 5));
    System.out.println("Index of Technology: " + str.indexOf("Technology"));
    System.out.println("Index of Technology after index 5: " + str.indexOf("Technology", 5));
  }
}