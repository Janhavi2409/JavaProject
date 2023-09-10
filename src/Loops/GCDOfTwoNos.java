package Loops;

import java.util.Scanner;

public class GCDOfTwoNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int gcd = 1;
        int x = Math.min(num1, num2);
        for (int i = 1; i <= x; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        System.out.print("GCD of " + num1 + " & " + num2 + " = " + gcd);
    }
}
