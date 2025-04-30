package MathOperations;

import java.util.Scanner;

class MathFunctions {
    public static double floor(double number) {
        return Math.floor(number);
    }

    public static double ceil(double number) {
        return Math.ceil(number);
    }

    public static long round(double number) {
        return Math.round(number);
    }
}

public class MathApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        double number = sc.nextDouble();

        System.out.println("Floor of " + number + " is: " + MathFunctions.floor(number));
        System.out.println("Ceil of " + number + " is: " + MathFunctions.ceil(number));
        System.out.println("Round of " + number + " is: " + MathFunctions.round(number));

        sc.close();
    }
}
