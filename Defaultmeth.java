// Program in Java to demonstrate the use of default interface methods.
interface Shape {
    double getArea();
    default void printArea() {
        System.out.println("Area of quadrilateral is: " + getArea());
    }
}
class Square implements Shape {
    double side;
    Square(double s) {
        this.side = s;
    }
    public double getArea() {
        return side * side;
    }
}
class Circle implements Shape {
    double radius;
    Circle(double r) {
        this.radius = r;
    }
    public double getArea() {
        return 3.14*radius*radius;
    }
    public void printArea(){
      System.out.println("Area of the Circle is: " + getArea());
    }
}
class Defaultmeth{
  public static void main(String args[]){
    Square sq = new Square(5);
    Circle ce = new Circle(5);
    sq.printArea();
    ce.printArea();
  }
}