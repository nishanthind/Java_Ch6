// Program in Java to implement nested interface.
interface Car {
   void drive();
   interface Engine {
      void start();
   }
}
class Sedan implements Car {
   public void drive() {
      System.out.println("Driving a sedan.");
   }
   class SedanEngine implements Engine {
      public void start() {
         System.out.println("Starting engine of a sedan.");
      }
   }
}
public class Maincar {
   public static void main(String[] args) {
      Sedan sedan = new Sedan();
      sedan.drive();
      Sedan.SedanEngine engine = sedan.new SedanEngine();
      engine.start();
   }
}
