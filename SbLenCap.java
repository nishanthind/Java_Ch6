// Program in Java to compute length and capacity of the StringBuffer object.
class SbLenCap{
  public static void main(String args[]){
    String str = "EduWe";
    StringBuffer sb = new StringBuffer(str);
    System.out.println("String as StringBuffer : "+sb);
    System.out.println("length of the StringBuffer Object : "+sb.length());
    System.out.println("Capacity of the buffer : "+sb.capacity());
  }
}