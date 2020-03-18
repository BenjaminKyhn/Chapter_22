import java.util.Scanner;

public class Listing_22_04 {
    public static int gcd(int m, int n){
        if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.println("Enter first integer: ");
        int m = input.nextInt();
        System.out.println("Enter second integer: ");
        int n = input.nextInt();

        System.out.println("The greatest common divisor for " + m + " and " + n + " is " + gcd(m, n));
    }
}
