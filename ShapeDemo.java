import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    double dim1, dim2;

    // Constructor
    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Abstract method to calculate area
    abstract double area();
}

// Subclass: Rectangle
class Rectangle extends Shape {
    Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    @Override
    double area() {
        return dim1 * dim2; // Area = length * breadth
    }
}

// Subclass: Triangle
class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * dim1 * dim2; // Area = 1/2 * base * height
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle rect = new Rectangle(length, breadth);
        System.out.println("Area of Rectangle: " + rect.area());

        // Input for Triangle
        System.out.print("\nEnter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        Triangle tri = new Triangle(base, height);
        System.out.println("Area of Triangle: " + tri.area());

        sc.close();
    }
}
