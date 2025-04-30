import java.util.Scanner;

interface Shape {
    double area();
}

class Rectangle implements Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

class Triangle implements Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class Exp4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of Rectangle: ");
        double length = scanner.nextDouble();
        System.out.println("Enter breadth of Rectangle: ");
        double breadth = scanner.nextDouble();
        Shape rect = new Rectangle(length, breadth);
        System.out.println("Area of rectangle: " + rect.area());

        System.out.println("Enter base of Triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter height of Triangle: ");
        double height = scanner.nextDouble();
        Shape tri = new Triangle(base, height);
        System.out.println("Area of triangle: " + tri.area());

        scanner.close();
    }
}