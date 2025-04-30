import java.util.Scanner;

// Interface
interface Sports {
    int sMarks = 0; // Interface variables are by default public, static, and final
    void setSportsMarks(int marks);
}

// Base Class
class Student {
    int rollNo;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }
}

// Inherited Class
class Test extends Student {
    int sub1, sub2;

    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public void getMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

// Final Class
class Result extends Test implements Sports {
    int sportsMarks;

    @Override
    public void setSportsMarks(int marks) {
        sportsMarks = marks;
    }

    public void display() {
        System.out.println("\nStudent Result ");
        System.out.println("Roll Number: " + getRollNo());
        getMarks();
        System.out.println("Sports Marks: " + sportsMarks);
        int total = sub1 + sub2 + sportsMarks;
        System.out.println("Total Marks (Academic + Sports): " + total);
    }
}

// Test Application
public class StudentResultApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        r.setRollNo(rollNo);

        System.out.print("Enter Marks for Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        int sub2 = sc.nextInt();
        r.setMarks(sub1, sub2);

        System.out.print("Enter Sports Marks: ");
        int sportsMarks = sc.nextInt();
        r.setSportsMarks(sportsMarks);

        r.display();
        sc.close();
    }
}
