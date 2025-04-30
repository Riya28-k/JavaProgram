import java.util.Scanner;
interface Sports {
    int sMarks = 10;
    void set();      
}
class studentSub {
int rollNo;
void setRollNo(int rollNo) {
this.rollNo = rollNo;
}
int getRollNo() {
return rollNo;
    }
}
class Test extends studentSub implements Sports {
int sub1, sub2;

    void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void getMarks() {
        System.out.println("Marks of Subject 1: " + sub1);
        System.out.println("Marks of Subject 2: " + sub2);
    }
    public void set() {
        System.out.println("Sports Marks: " + sMarks);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Test t = new Test();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        t.setRollNo(roll);

        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();

        t.setMarks(m1, m2);

        // Output
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + t.getRollNo());
        t.getMarks();
        t.set(); 
        sc.close();
    }
}




