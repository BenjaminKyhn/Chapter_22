package Eksekveringstider;

import java.util.Arrays;
import java.util.Random;

public class Algoritmer {
    public static void main(String[] args) {
        // Create an array and add some random numbers
        int[] numbers = new int[20000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*1000000);
        }

        // Sort the array
        Arrays.sort(numbers);

        // Binary search
        BinarySearch binarySearch = new BinarySearch();
        MyTimer.start();
        System.out.println("The sorted array is " + Arrays.toString(numbers));
        System.out.println("Resultat: " + binarySearch.binarySearch(numbers, 3));
        MyTimer.stop();
    }
}
