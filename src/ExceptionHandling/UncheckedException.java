package ExceptionHandling;

import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        try {
            int a = arr[0];
            int b = arr[1];
            System.out.println("Sum is: " + (a + b));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Insufficient array elements");
        }
    }
}
