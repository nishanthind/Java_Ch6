// Program in Java to display the object before overriding toString().
class Student {
  int id;
  String name;
  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
}
public class NoToStringEx {
  public static void main(String[] args) {
    Student s = new Student(101, "Maneesh");
    System.out.println(s);
  }
}
