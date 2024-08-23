interface Shape {
  double calculateArea();
  default void printArea(){
    System.out.println("Area of the shape is :: "+calculateArea());
  }
}
class Rectangle implements Shape {
  private double length;
  private double width;
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
    Shape.IncShapeCount();
  }
  public double calculateArea() {
    return length * width;
  }
}
class Circle implements Shape {
  private double radius;
  private static int shapeCount = 0;
  public Circle(double radius) {
    this.radius = radius;
    Shape.IncShapeCount();
  }
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
}
public class Mainshape1 {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(5, 10);
    Circle cir = new Circle(5);
    rect.printArea();
    cir.printArea();
    System.out.println("Number of Shapes: " + Shape.shapecount);
  }
}
