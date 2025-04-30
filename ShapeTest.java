import java.util.Scanner;

// Shape Interface
interface Shape {
    void area();
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public void area() {
        int rectArea = length * breadth;
        System.out.println("Area of Rectangle: " + rectArea);
    }
}

// Triangle class implementing Shape
class Triangle implements Shape {
    int base, height;

    Triangle(int b, int h) {
        base = b;
        height = h;
    }

    public void area() {
        double triArea = 0.5 * base * height;
        System.out.println("Area of Triangle: " + triArea);
    }
}

// Test class
public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle input
        System.out.print("Enter length of Rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of Rectangle: ");
        int breadth = sc.nextInt();
        Rectangle rect = new Rectangle(length, breadth);
        rect.area();

        // Triangle input
        System.out.print("\nEnter base of Triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter height of Triangle: ");
        int height = sc.nextInt();
        Triangle tri = new Triangle(base, height);
        tri.area();

        sc.close();
    }
}
