import java.util.Scanner;

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("Insufficient balance!!");
        }
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 100) { // Maintain a minimum balance of 100
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("You cannot withdraw this amount. Minimum balance of 100 must be maintained.");
        }
    }
}

public class BankAcc {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        
        SavingsAccount obj = new SavingsAccount(initialBalance);
        
        System.out.print("Enter deposit amount: ");
        obj.deposit(scanner.nextDouble());
        
        System.out.print("Enter withdrawal amount: ");
        obj.withdraw(scanner.nextDouble());
        
        scanner.close();
    }
}
