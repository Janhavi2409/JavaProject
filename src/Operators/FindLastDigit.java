package Operators;

import java.util.Scanner;

public class FindLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int n1 = Math.abs(n);
        int m = n1;
        int a = n;
        while (m > 0) {
            n1 %= 10;
            m /= 10;
        }
        System.out.print("Last digit of " + a + " is: " + n1);
    }
}
