class LastIndexOfEx {
  public static void main(String args[]) {
    String str = "Welcome to EduWe";
    System.out.println("Last occurrence of 'o' : " + str.lastIndexOf('o'));
    System.out.println("Last occurrence of 'o' from 15th index : " + str.lastIndexOf('o', 15));
    System.out.println("Last occurrence of 'Ed' : " + str.lastIndexOf("Ed"));
    System.out.println("Last occurrence of 'Ed' from 10th index : " + str.lastIndexOf("Ed", 10));
  }
}
