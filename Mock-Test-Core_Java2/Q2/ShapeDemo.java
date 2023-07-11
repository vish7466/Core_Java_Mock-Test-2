abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class ShapeCalculator {
    public void printArea(Shape shape) {
        System.out.println("Area: " + shape.calculateArea());
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(2.5);
        Triangle triangle = new Triangle(4, 6);

        ShapeCalculator calculator = new ShapeCalculator();
        calculator.printArea(rectangle); // Output: Area: 15.0
        calculator.printArea(circle);    // Output: Area: 19.634954084936208
        calculator.printArea(triangle);  // Output: Area: 12.0
    }
}
