package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int maxIndex = 0;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 46, 43, -21, 78, 39, 79};
        System.out.print("Array before sorting: ");
        System.out.println(Arrays.toString(array));
        System.out.print("Array after sorting: ");
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
