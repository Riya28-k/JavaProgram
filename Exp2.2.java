import java.util.Scanner;

class Area {
    double length;  
    double breadth; 

    
    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

   
    double getArea() {
        return length * breadth;
    }
}

public class Exp2area{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();

        
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        
        rectangle.setDim(length, breadth);
        System.out.println("Area of the rectangle: " + rectangle.getArea());

        scanner.close();
    }
}
