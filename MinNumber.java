import java.util.Scanner;  

public class MinNumber {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");
        
        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

       
        int min = arr[0];

        
        for (int i = 1; i < 10; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

       
        System.out.println("The minimum number is: " + min);
        sc.close();
    }
}
