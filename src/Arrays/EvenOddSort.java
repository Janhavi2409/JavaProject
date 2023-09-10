package Arrays;

import java.util.Scanner;

class EvenOddSort {
    public static int[] evenOdd(int[] arr, int n) {
        int[] newArray = new int[n];
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                newArray[evenCount] = arr[i];
                evenCount++;
            } else {
                oddCount++;
            }
        }
        oddCount = n - oddCount;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                newArray[oddCount] = arr[i];
                oddCount++;
            }
        }
        return newArray;
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
        int[] ans = evenOdd(arr, n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
