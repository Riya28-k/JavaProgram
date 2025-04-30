import java.util.Scanner;

class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10; // 10% bonus
    }

    public void generateReport() {
        System.out.println("Employee: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + calculateBonus());
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% bonus for managers
    }

    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    public void writeCode() {
        System.out.println(name + " is writing code.");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    public void debugCode() {
        System.out.println(name + " is debugging code.");
    }
}

public class Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Manager's Name: ");
        String mName = scanner.nextLine();
        System.out.print("Enter Manager's Address: ");
        String mAddress = scanner.nextLine();
        System.out.print("Enter Manager's Salary: ");
        double mSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        Manager manager = new Manager(mName, mAddress, mSalary);
        
        System.out.print("Enter Developer's Name: ");
        String dName = scanner.nextLine();
        System.out.print("Enter Developer's Address: ");
        String dAddress = scanner.nextLine();
        System.out.print("Enter Developer's Salary: ");
        double dSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        Developer developer = new Developer(dName, dAddress, dSalary);
        
        System.out.print("Enter Programmer's Name: ");
        String pName = scanner.nextLine();
        System.out.print("Enter Programmer's Address: ");
        String pAddress = scanner.nextLine();
        System.out.print("Enter Programmer's Salary: ");
        double pSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        Programmer programmer = new Programmer(pName, pAddress, pSalary);
        
        System.out.println();
        manager.generateReport();
        manager.manageProject();
        
        System.out.println();
        developer.generateReport();
        developer.writeCode();
        
        System.out.println();
        programmer.generateReport();
        programmer.debugCode();
        
        scanner.close();
    }
}
