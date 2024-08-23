// Program in Java to insert a string in Stringbuffer object using insert().
class InsertEx {
  public static void main(String args[]) {
    StringBuffer sb = new StringBuffer("Ee");
    System.out.println("Buffer before insert: " + sb);
    sb.insert(4, "duW");
    System.out.println("The Buffer after insert: " + sb);
  }
}
