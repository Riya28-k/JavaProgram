import java.util.Scanner;

// Base class (Student)
class Student {
    int roll_no;

    void getRollNo(int roll) {
        roll_no = roll;
    }

    void showRollNo() {
        System.out.println("Roll No: " + roll_no);
    }
}

// Derived class (Test) inheriting Student
class Test extends Student {
    int sub1, sub2;

    void getMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void showMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

// Derived class (Result) inheriting Test
class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }
}

// Main class
public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result student = new Result();

        // Taking user input
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        student.getRollNo(roll);

        System.out.print("Enter Marks in Subject 1: ");
        int marks1 = sc.nextInt();
        System.out.print("Enter Marks in Subject 2: ");
        int marks2 = sc.nextInt();
        student.getMarks(marks1, marks2);

        // Displaying values
        System.out.println("\n Student Details ");
        student.showRollNo();
        student.showMarks();
        student.displayResult();

        sc.close();
    }
}
