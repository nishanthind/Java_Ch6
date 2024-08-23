// Program in Java to use startsWith, endsWith and contains methods.
public class SearchString {
  public static void main(String[] args) {
    String str = "Welcome to EduWe";
    boolean starts = str.startsWith("Welcome");
    System.out.println("String starts with Welcome: "+starts);
    boolean ends = str.endsWith("EduWe");
    System.out.println("String ends with EduWe: "+ends);
    boolean contain = str.contains("come");
    System.out.println("String Contains come: " + contain);
  }
}
