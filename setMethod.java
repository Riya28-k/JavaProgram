import java.util.Scanner;

interface Sports {
    int sMarks = 0;  // Constant (public static final)
    void set();      // Abstract method
}

class StudentSports implements Sports {
    int sportsMarks;

    public void set() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sports marks: ");
        sportsMarks = sc.nextInt();
    }

    void display() {
        System.out.println("Sports Marks: " + sportsMarks);
    }
}

public class setMethod {
    public static void main(String[] args) {
        StudentSports ss = new StudentSports();
        ss.set();
        ss.display();
    }
}
