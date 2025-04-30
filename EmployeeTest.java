import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Get yearly salary
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Give 10% raise
    public void giveRaise() {
        monthlySalary = monthlySalary * 1.10;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Employee 1 input
        System.out.println("Enter first employee's first name:");
        String firstName1 = input.nextLine();
        System.out.println("Enter first employee's last name:");
        String lastName1 = input.nextLine();
        System.out.println("Enter first employee's monthly salary:");
        double salary1 = input.nextDouble();
        input.nextLine(); // clear buffer

        // Employee 2 input
        System.out.println("Enter second employee's first name:");
        String firstName2 = input.nextLine();
        System.out.println("Enter second employee's last name:");
        String lastName2 = input.nextLine();
        System.out.println("Enter second employee's monthly salary:");
        double salary2 = input.nextDouble();

        // Create employee objects
        Employee emp1 = new Employee(firstName1, lastName1, salary1);
        Employee emp2 = new Employee(firstName2, lastName2, salary2);

        // Display initial yearly salary
        System.out.println("\n--- Initial Yearly Salaries ---");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.getYearlySalary());

        // Give 10% raise
        emp1.giveRaise();
        emp2.giveRaise();

        // Display new yearly salary
        System.out.println("\n--- Yearly Salaries After 10% Raise ---");
        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + ": " + emp1.getYearlySalary());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + ": " + emp2.getYearlySalary());

        input.close();
    }
}
