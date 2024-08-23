// Program in Java to reverse Stringbuffer object using reverse().
class ReverseEx{
  public static void main(String args[]){
    StringBuffer sb = new StringBuffer("EduWe");
    System.out.println("Buffer before reverse: " + sb);
    sb.reverse();
    System.out.println("Buffer after reverse: " + sb);
  }
}