// Program in Java to compare portion of two strings using regionMatches().
public class RegionMatchesExample {
  public static void main(String[] args) {
    String str1 = "Eduwe";
    String str2 = "WeEdu";
    System.out.println(str1.regionMatches(3, str2, 0, 2));
    System.out.println(str1.regionMatches(true, 3, str2, 0, 2));
  }
}
