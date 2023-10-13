package Sorting;

import java.util.Arrays;

public class QuickSort {

    static void quickSort(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = array[mid];
        while (start <= end) {
            while (array[start] < pivot) {
                start++;
            }
            while (array[end] > pivot) {
                end--;
            }
            if (start <= end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
            quickSort(array, low, end);
            quickSort(array, start, high);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 46, 43, -21, 78, 39, 79};
        System.out.print("Array before sorting: ");
        System.out.println(Arrays.toString(array));
        System.out.print("Array after sorting: ");
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
