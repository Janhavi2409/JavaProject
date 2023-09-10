package Loops;

import java.util.Scanner;

public class NextPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int x = n;
        x++;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                x++;
                i = 2;
            }
        }
        System.out.println("Next prime number after " + n + " is " + x);
    }
}
