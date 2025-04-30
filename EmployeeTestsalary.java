import java.util.Scanner;

class Employee {
String firstName;
String lastName;
double mSalary;
Employee() {
firstName = "";
lastName = "";
mSalary = 0;
    }
void setter() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter First Name: ");
firstName = sc.nextLine();
System.out.print("Enter Last Name: ");
lastName = sc.nextLine();
System.out.print("Enter Monthly Salary: ");
double salary = sc.nextDouble();
mSalary = salary > 0 ? salary : 0.0;
    }
void getter() {
System.out.println("First Name: " + firstName);
System.out.println("Last Name: " + lastName);
System.out.println("Monthly Salary: " + mSalary);
System.out.println("Yearly Salary: " + getYSalary());
    }
double getYSalary() {
 return mSalary * 12;
    }
void raiseSalary(double percent) {
mSalary += mSalary * percent / 100;
    }
}
public class EmployeeTestsalary {
public static void main(String[] args) {
Employee emp1 = new Employee();
Employee emp2 = new Employee();
System.out.println("Enter details for Employee 1:");
emp1.setter();
System.out.println("\nEnter details for Employee 2:");
emp2.setter();
System.out.println("\nBefore 10% Raise:");
emp1.getter();
emp2.getter();
emp1.raiseSalary(10);
emp2.raiseSalary(10);
System.out.println("\nAfter 10% Raise:");
emp1.getter();
emp2.getter();
    }
}