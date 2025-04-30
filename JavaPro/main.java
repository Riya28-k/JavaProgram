import java.util.Scanner;

abstract class Shape {
    double dim1, dim2;

    public Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void area();
}

class Rectangle extends Shape {
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    void area() {
        System.out.println("Area of rectangle: " + (dim1 * dim2));
    }
}

class Triangle extends Shape {
    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    void area() {
        System.out.println("Area of triangle: " + (0.5 * dim1 * dim2));
    }
}

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and breadth of rectangle: ");
        Rectangle rect = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        rect.area();

        System.out.println("Enter base and height of triangle: ");
        Triangle tri = new Triangle(scanner.nextDouble(), scanner.nextDouble());
        tri.area();

        scanner.close();
    }
}