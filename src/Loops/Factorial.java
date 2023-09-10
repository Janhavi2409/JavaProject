package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int m = n;
        int factorial = 1;
        while (m > 1) {
            factorial *= m;
            m--;
        }
        System.out.print(n + "! = " + factorial);
    }
}
