import java.util.Scanner;
public class Student {
int rollNo;
public void setRollNo(int rollNo) {
this.rollNo = rollNo;
 }
public int getRollNo() {
return rollNo;
 }
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Student s1 = new Student();
System.out.print("Enter roll number: ");
int inputRollNo = sc.nextInt(); 
s1.setRollNo(inputRollNo); 
System.out.println("Roll Number is: " + s1.getRollNo()); // display roll number
sc.close();
 } 
}
