//Program in Java to iterate character of string in java using for loop.
class ExtractChar{
  public static void main(String args[]){
    String str = "EduWe";
    for(int i=0; i<str.length(); i++){
      System.out.println("Character at index "+i+": "+str.charAt(i));
    }
  }
}