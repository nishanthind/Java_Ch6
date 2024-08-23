interface Shape {
  double calculateArea();
  default void printArea(){
    System.out.println("Area of the shape :: "+calculateArea());
  }
}
class Rectangle implements Shape {
  private double length;
  private double width;
  private static int shapeCount = 0;
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
    shapeCount++;
  }
  public double calculateArea() {
    return length * width;
  }
  public static int getShapeCount() {
    return shapeCount;
  }
}
class Circle implements Shape {
  private double radius;
  private static int shapeCount = 0;
  public Circle(double radius) {
    this.radius = radius;
    shapeCount++;
  }
  public double calculateArea() {
    return Math.PI * radius * radius;
  }
  public static int getShapeCount() {
    return shapeCount;
  }
}
public class Mainshape {
  public static void main(String[] args) {
    Rectangle rect = new Rectangle(5, 10);
    Circle cir = new Circle(5);
    rect.printArea();
    cir.printArea();
    System.out.println("Number of Rectangles: " + Rectangle.getShapeCount());
    System.out.println("Number of Circles: " + Circle.getShapeCount());
  }
}
