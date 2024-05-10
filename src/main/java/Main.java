// Superclass Shape
class Shape {
    double area;
    double perimeter;

    // Method to calculate the area of the shape
    void calculateArea() {
        System.out.println("Area of the shape: " + area);
    }

    // Method to calculate the perimeter of the shape
    void calculatePerimeter() {
        System.out.println("Perimeter of the shape: " + perimeter);
    }
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    // Constructor to initialize the radius
    Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * Math.pow(radius, 2);
        this.perimeter = 2 * Math.PI * radius;
    }

    // Overriding the calculateArea() method
    @Override
    void calculateArea() {
        System.out.println("Area of the circle: " + area);
    }

    // Overriding the calculatePerimeter() method
    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    double length;
    double breadth;

    // Constructor to initialize the length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
        this.perimeter = 2 * (length + breadth);
    }

    // Overriding the calculateArea() method
    @Override
    void calculateArea() {
        System.out.println("Area of the rectangle: " + area);
    }

    // Overriding the calculatePerimeter() method
    @Override
    void calculatePerimeter() {
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
        circle.calculatePerimeter();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
}
