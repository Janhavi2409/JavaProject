package Loops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int counter = 3;
        System.out.print(a + " " + b + " ");
        while (counter <= n) {
            int temp = a + b;
            a = b;
            b = temp;
            counter++;
            System.out.print(b + " ");
        }
    }
}
