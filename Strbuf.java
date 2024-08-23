// Program in Java to define StringBuffer objects through various constructors.
class Strbuf{
  public static void main(String args[]){
    // Creating a StringBuffer object with the default constructor
    StringBuffer sb1 = new StringBuffer();
    System.out.println("Default capacity of the buffer : "+sb1.capacity());
    // Creating a StringBuffer object with a specified capacity
    StringBuffer sb2 = new StringBuffer(25);
    System.out.println("Initial Capacity of the buffer is : "+sb2.capacity());
    String str = "EduWe";
    // Creating a StringBuffer object from a string
    StringBuffer sb3 = new StringBuffer(str);
    System.out.println("String as StringBuffer : "+sb3);
    // Creating a StringBuffer object from another StringBuffer object
    StringBuffer sb4 = new StringBuffer(sb3);
    System.out.println("Another CharSequence as StringBuffer : "+sb4);
  }
}
