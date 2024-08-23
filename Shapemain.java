abstract class Shape {
    static int shapeCount = 0;
    abstract double getArea();
    public static void incrementShapeCount() {
        shapeCount++;
    }
    public void printArea() {
        System.out.println("Area of shape: " + getArea());
    }
}
class Rectangle extends Shape {
    double length, width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        incrementShapeCount();
    }
    double getArea() {
        return length * width;
    }
}
class Circle extends Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
        incrementShapeCount();
    }
    double getArea() {
        return Math.PI * radius * radius;
    }
}
public class Shapemain {
    public static void main(String[] args) {
        Shape rect = new Rectangle(2, 3);
        Shape cir = new Circle(2);
        rect.printArea();
        cir.printArea();
        System.out.println("Total number of shapes created: " + Shape.shapeCount);
    }
}
