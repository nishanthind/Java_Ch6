// Program in Java to display the object After overriding toString().
class Student {
  int id;
  String name;
  Student(int id, String name) {
    this.id = id;
    this.name = name;
  }
  public String toString() {
    return "Student [id=" + id + ", name=" + name + "]";
  }
}
public class ToStringEx {
  public static void main(String[] args) {
    Student s = new Student(101, "Maneesh");
    System.out.println(s);
  }
}
