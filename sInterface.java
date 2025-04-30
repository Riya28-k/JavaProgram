import java.util.Scanner;

// Parent class
class Student {
    String name;
    int rollNo;

    void setStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        name = sc.nextLine();
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
    }

    void getStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

// Test class inheriting Student
class Test extends Student {
    int sub1, sub2;

    void setMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Subject 1: ");
        sub1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        sub2 = sc.nextInt();
    }

    void getMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

// Sports interface
interface Sports {
    void set();  // To set sports marks
}

// Result class that inherits Test and implements Sports
class Result extends Test implements Sports {
    int sportsMarks;

    // Implementing set() from Sports interface
    public void set() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sports marks: ");
        sportsMarks = sc.nextInt();
    }

    void displayResult() {
        getStudentDetails();
        getMarks();
        System.out.println("Sports Marks: " + sportsMarks);
        int total = sub1 + sub2 + sportsMarks;
        System.out.println("Total Marks: " + total);
    }
}

// Main class
public class sInterface {
    public static void main(String[] args) {
        Result r = new Result();

        r.setStudentDetails();  // Enter name and roll number
        r.setMarks();           // Enter subject marks
        r.set();                // Enter sports marks

        System.out.println("\nFinal Result");
        r.displayResult();      // Display all marks and total
    }
}
