package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 46, 43, -21, 78, 39, 79};
        System.out.print("Array before sorting: ");
        System.out.println(Arrays.toString(array));
        System.out.print("Array after sorting: ");
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}

