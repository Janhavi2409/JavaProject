package Arrays;

import java.util.Scanner;

public class SumOfArray {
    public static int sum(int[] arr, int n) {
        int s = 0;
        for (int i = 0; i < n; i++) {
            s += arr[i];
        }
        return s;
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
        System.out.print("Sum of array = " + sum(arr, n));
    }
}
