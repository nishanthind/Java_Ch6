// Program in Java to demonstrate multiple inheritance in Java using interfaces and class.
class Enrol {
  String EnrolNo;
  public void Enrollment(String SID, String CID) {
      EnrolNo = SID + CID;
  }
}
interface Student {
  void addStudent(String name, int age, String ID);
}
interface Course {
  void addCourse(String name, int duration, String ID);
}
// class extending another class and implementing multiple inheritance.
class StudentCourse extends Enrol implements Student, Course {
    String StudentName;
    int StudentAge;
    String StudentID;
    String CourseID;
    String CourseName;
    int CourseDuration;
    public void addStudent(String name, int age, String ID) {
        StudentName = name;
        StudentAge = age;
        StudentID = ID;
    }
    public void addCourse(String name, int duration, String ID) {
        CourseName = "Computer Science";
        CourseDuration = duration;
        CourseID = ID;
        
    }
    void getStudentInfo(){
      System.out.println(" Student of Student ID "+this.StudentID+"\n is enrolled in the course ID "+this.CourseID);
      System.out.println(" With Enrollment No. :: "+EnrolNo);
      System.out.println(" Name of the student :: "+StudentName);
      System.out.println(" Age of the student :: "+StudentAge);
      System.out.println(" Course Enrolled in :: "+CourseName);
      System.out.println(" Duration of the Course :: "+CourseDuration);
      
    }
    public static void main(String[] args) {
        StudentCourse stc = new StudentCourse();
        stc.addStudent("Ankit", 22, "101");
        stc.addCourse("Computer Science", 4, "11");
        //Enrolling student in a course using extended method
        stc.Enrollment("101","11");
        stc.getStudentInfo();
    }
}
