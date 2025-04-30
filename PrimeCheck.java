import java.util.Scanner;
public class PrimeCheck {
    public static void main(String[] args) {
        // Directly take the command-line argument
        int number = Integer.parseInt(args[0]); // Convert the argument to integer

        boolean isPrime = true;

        // Prime number check logic
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
		
    }
}

