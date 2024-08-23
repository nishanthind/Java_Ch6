// Program in Java to implement multiple inheritance using interfaces.
interface TerrestrialAnimal {
  void move();
}
interface AquaticAnimal {
  void move();
}
class AmphibianAnimal implements TerrestrialAnimal, AquaticAnimal {
  String name;
  AmphibianAnimal(String name){
    this.name = name;
  }
  public void move(){
    System.out.println(this.name+" can move on land like Terrstial animals.");
    System.out.println(this.name+" can swim in water like Aquatic animals.");
  }
  public static void main(String args[]){
    AmphibianAnimal frog = new AmphibianAnimal("Frog");
    frog.move();
  }
}
