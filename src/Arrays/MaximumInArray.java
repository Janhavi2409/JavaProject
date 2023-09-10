package Arrays;

import java.util.Scanner;

public class MaximumInArray {
    public static int maxNumber(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Highest value in array is: " + maxNumber(arr, n));
    }
}
