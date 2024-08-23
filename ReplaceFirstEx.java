public class ReplaceFirstEx {
  public static void main(String[] args) {
    String str = "My name is John and his name is John";
    System.out.println("Original string: " + str);
    str = str.replaceFirst("John", "Jane");
    System.out.println("After replacing first occurrence: " + str);
  }
}
