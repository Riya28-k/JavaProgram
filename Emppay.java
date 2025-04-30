import java.util.Scanner;

class Emp {
    String name;
    int empid;
    String category;
    double bpay, hra, da, pf, allowance, grosspay, incometax, npay;

    void calculateComponents() {
        da = 0.05 * bpay;
        hra = 0.09 * bpay;
        pf = 0.11 * bpay;
        allowance = 0.10 * bpay;
        grosspay = bpay + da + hra + allowance;
        incometax = 0.10 * grosspay; // assuming 10% income tax
        npay = grosspay - (pf + incometax);
    }

    void display() {
        System.out.println("\nEmployee Payroll Details");
        System.out.println("Name       : " + name);
        System.out.println("Emp ID     : " + empid);
        System.out.println("Category   : " + category);
        System.out.println("Basic Pay  : " + bpay);
        System.out.println("DA         : " + da);
        System.out.println("HRA        : " + hra);
        System.out.println("PF         : " + pf);
        System.out.println("Allowance  : " + allowance);
        System.out.println("Gross Pay  : " + grosspay);
        System.out.println("Income Tax : " + incometax);
        System.out.println("Net Pay    : " + npay);
    }
}

public class Emppay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Emp e = new Emp();

        System.out.print("Enter Employee Name: ");
        e.name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        e.empid = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Category: ");
        e.category = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        e.bpay = sc.nextDouble();

        e.calculateComponents();
        e.display();
    }
}
