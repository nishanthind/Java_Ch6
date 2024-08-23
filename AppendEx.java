// Program in Java to append a string buffer object using append().
class AppendEx{
  public static void main(String args[]){
    StringBuffer sb = new StringBuffer("EduWe");
    System.out.println("Buffer before append: " + sb);
    sb.append(" Institute");
    System.out.println("Buffer after append: " + sb);
  }
}