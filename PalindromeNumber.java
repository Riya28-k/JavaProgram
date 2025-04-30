import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from the user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if it's a palindrome
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10;   // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Build the reversed number
            num /= 10;  // Remove the last digit
        }

        return originalNum == reversedNum;  // Check if original and reversed are same
    }
}

