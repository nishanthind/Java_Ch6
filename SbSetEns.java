// Program in Java to set new length and capacity of the StringBuffer object using setLength() and ensureCapacity().
class SbSetEns{
  public static void main(String args[]){
    String str = "EduWe";
    StringBuffer sb = new StringBuffer(str);
    System.out.println("String as StringBuffer : "+sb);
    System.out.println("Capacity of the buffer : "+sb.capacity());
    sb.ensureCapacity(30);
    System.out.println("New Capacity of the buffer : "+sb.capacity());
    System.out.println("length of the StringBuffer Object : "+sb.length());
    sb.setLength(10);
    System.out.println("New length of the StringBuffer Object : "+sb.length());
  }
}