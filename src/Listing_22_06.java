import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listing_22_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Find all the prime numbers <= n, enter n: ");
        int n = input.nextInt();

        // A list to hold prime numbers
        List<Integer> list = new ArrayList<>();

        final int NUMBER_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
        int squareRoot = 1; // Check whether the number <= squareRoot

        System.out.println("The prime numbers are \n");

        // Repeatedly find prime numbers
        while (number <= n){
            // Assume the number is prime
            boolean isPrime = true;

            if (squareRoot * squareRoot < number) squareRoot++;

            // Test whether number is prime
            for (int k = 0; k < list.size() && list.get(k) <= squareRoot; k++) {
                if (number % list.get(k) == 0){ // If true, not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the foor loop
                }
            }

            // Print the prime numbers and increase the count
            if (isPrime){
                count++; // Increase the count
                list.add(number); // Add a new prime to the list
                if (count % NUMBER_PER_LINE == 0){
                    // Print the number and advance to a new line
                    System.out.println(number);
                }
                else
                    System.out.println(number + " ");
            }

            // Check whether the next number is prime
            number++;
        }

        System.out.println("\n" + count + " prime(s) less than or equal to " + n);
    }
}
