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

// Child class
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

// Main class
public class inherit {
    public static void main(String[] args) {
        Test t = new Test();

        t.setStudentDetails();  // Input student name and roll number
        t.setMarks();           // Input subject marks

        System.out.println("\nStudent Details");
        t.getStudentDetails();  // Display student details
        t.getMarks();           // Display subject marks
    }
}
