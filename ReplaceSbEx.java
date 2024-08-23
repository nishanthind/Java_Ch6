// Program in Java to replace portion of Stringbuffer object using replace().
class ReplaceSbEx{
  public static void main(String args[]){
    StringBuffer sb = new StringBuffer("Welcome to EduWe");
    System.out.println("Buffer before replacement: " + sb);
    sb.replace(0,10,"Hello!");
    System.out.println("Buffer after replacement: " + sb);
  }
}