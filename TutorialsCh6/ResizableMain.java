// Define the Shape interface
interface Shape {
    double calculateArea();

    double calculatePerimeter();
}

// Define the Resizable interface as a sub-interface of Shape
interface Resizable extends Shape {
    void resize(double factor);
}

// Implement the interfaces in the ResizableCircle class
class ResizableCircle implements Resizable {
    private double radius;

    public ResizableCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void resize(double factor) {
        if (factor > 0) {
            this.radius *= factor;
        } else {
            System.out.println("Factor should be greater than 0 for resizing.");
        }
    }
}

public class ResizableMain {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(5.0);

        System.out.println("Original Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        // Resize the circle by a factor of 2
        circle.resize(2.0);

        System.out.println("\nResized Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());
    }
}