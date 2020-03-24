package Eksekveringstider;

public class BubbleSort {
    public void bubbleSort(int[] numbers){
        boolean swapped;
        int temp;

        do {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    swapped = true;
                }
            }
        } while(swapped);
    }
}
