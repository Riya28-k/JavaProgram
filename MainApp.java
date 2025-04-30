import java.util.Scanner;

class Stat {
    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    int cube(int n) {
        return n * n * n;
    }
}

class DecConvert {
    String toBinary(int n) {
        return Integer.toBinaryString(n);
    }

    String toOctal(int n) {
        return Integer.toOctalString(n);
    }

    String toHex(int n) {
        return Integer.toHexString(n);
    }
}

class ReverseConvert {
    int fromBinary(String bin) {
        return Integer.parseInt(bin, 2);
    }

    int fromOctal(String oct) {
        return Integer.parseInt(oct, 8);
    }

    int fromHex(String hex) {
        return Integer.parseInt(hex, 16);
    }
}

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stat s = new Stat();
        DecConvert dc = new DecConvert();
        ReverseConvert rc = new ReverseConvert();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine();  // consume newline

        System.out.println("\nStatistical Operations ");
        System.out.println("Factorial: " + s.factorial(num));
        System.out.println("Cube     : " + s.cube(num));

        System.out.println("\n Decimal to Other Conversions ");
        System.out.println("Binary   : " + dc.toBinary(num));
        System.out.println("Octal    : " + dc.toOctal(num));
        System.out.println("Hex      : " + dc.toHex(num));

        System.out.print("\nEnter a binary number to convert to decimal: ");
        String bin = sc.nextLine();
        System.out.println("Decimal  : " + rc.fromBinary(bin));

        System.out.print("Enter an octal number to convert to decimal: ");
        String oct = sc.nextLine();
        System.out.println("Decimal  : " + rc.fromOctal(oct));

        System.out.print("Enter a hex number to convert to decimal: ");
        String hex = sc.nextLine();
        System.out.println("Decimal  : " + rc.fromHex(hex));
    }
}
