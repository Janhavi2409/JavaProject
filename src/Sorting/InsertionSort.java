package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 46, 43, -21, 78, 39, 79};
        System.out.print("Array before sorting: ");
        System.out.println(Arrays.toString(array));
        System.out.print("Array after sorting: ");
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}