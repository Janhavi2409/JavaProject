package Arrays;

import java.util.Scanner;

public class RotatingArray {
    public static int[] rotateArray(int[] arr, int n) {
        int[] newArray = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            if (n - i - 1 != 0) {
                newArray[i] = arr[i + 1];
            } else {
                newArray[i] = temp;
            }
        }
        return newArray;
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
        int[] ans = rotateArray(arr, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
