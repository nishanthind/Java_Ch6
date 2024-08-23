// Program in java to access the character of 
class Strimmutable{
  public static void main(String args[]){
    String str = new String("EduWe");
    
    System.out.println("String before modification: "+str);
    str[3] = 'w';
    System.out.println("String after modification: "+str);
  }
}