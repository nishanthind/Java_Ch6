// Program in Java to delete()and deleteCharAt().
class DeleteEx{
  public static void main(String args[]){
    StringBuffer sb = new StringBuffer("Welcome to EduWe");
    System.out.println("Buffer before Deletion: " + sb);
    sb.delete(0,9);
    System.out.println("Buffer after First deletion: " + sb);
    sb.deleteCharAt(0);
    System.out.println("Buffer after second deletion: " + sb);
  }
}