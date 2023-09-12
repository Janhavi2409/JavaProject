package Sorting;

import java.util.Scanner;

public class QuickSort {
    static int partion(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pidex = partion(arr, low, high);
            quickSort(arr, low, pidex - 1);
            quickSort(arr, pidex + 1, high);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Array before sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] ans = quickSort(arr, 0, n - 1);
        System.out.print("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
