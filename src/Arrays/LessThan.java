package Arrays;

import java.util.Scanner;

public class LessThan {
    public static int[] lessThanArray(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                count++;
            }
        }

        int[] newArray = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < k) {
                newArray[index] = arr[i];
                index++;
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
        System.out.print("Enter less than: ");
        int k = sc.nextInt();
        int[] ans = lessThanArray(arr, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
