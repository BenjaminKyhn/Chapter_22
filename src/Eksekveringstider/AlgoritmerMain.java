package Eksekveringstider;

import java.util.Arrays;
import java.util.Random;

public class AlgoritmerMain {
    public static void main(String[] args) {
        // Create two identical lists because we're going to test two different sorting methods
        int[] list1 = new int[20000];
        int[] list2 = new int[20000];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = list2[i] = (int)(Math.random()*1000000);
        }

        // Selection sort list1
        MyTimer.start();
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(list1);
        System.out.println("List 1 sorted using selection sort: " + Arrays.toString(list1));
        MyTimer.stop();
        System.out.println();

        // Bubble sort list2
        MyTimer.start();
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(list2);
        System.out.println("List 2 sorted using bubble sort: " + Arrays.toString(list2));
        MyTimer.stop();
        System.out.println();

        // Binary search for the number 3 (requires a sorted array)
        BinarySearch binarySearch = new BinarySearch();
        MyTimer.start();
        System.out.println("Resultat: " + binarySearch.binarySearch(list1, 3));
        MyTimer.stop();
    }
}
