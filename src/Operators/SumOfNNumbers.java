package Operators;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of " + n + " natural numbers is: " + (n * (n + 1) / 2));
    }
}
