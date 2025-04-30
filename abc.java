import java.util.*;
class NegativeException extends Exception {
 @Override
public String toString() {
 return "Negative age is not allowed.";
    }
}
class Abc {
 public static void main(String args[]) {
 int age;
 try {
 Scanner scanner = new Scanner(System.in);
 System.out.println("Enter your age: ");
 age = scanner.nextInt();  
 if (age < 0) {
 throw new NegativeException(); 
 } else {
 System.out.println("Your age is: " + age);
 }
 } catch (NegativeException e) {
 System.out.println(e);  
        }
    }
}
