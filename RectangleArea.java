import java.util.Scanner;
class area{
double length;
double breadth;
public void setDim(double l,double b){
length = l;
breadth = b;
}
public double getArea(){
return length*breadth;
}
}
public class RectangleArea{
public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
area rectangle=new area();
System.out.println("enter length of rectangle: ");
double length = scanner.nextDouble();
System.out.println("enter breadth of rrectangle: ");
double breadth = scanner.nextDouble();
rectangle.setDim(length,breadth);
System.out.println("Area of rectanle is: "+ rectangle.getArea());
scanner.close();
}
}