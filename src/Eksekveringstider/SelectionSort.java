package Eksekveringstider;

public class SelectionSort {
    public void selectionSort(int[] numbers){
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentMin = numbers[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (currentMin > numbers[j]){
                    currentMin = numbers[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                numbers[currentMinIndex] = numbers[i];
                numbers[i] = currentMin;
            }
        }
    }
}
