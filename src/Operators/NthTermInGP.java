package Operators;

import java.util.Scanner;

public class NthTermInGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter common ratio between 2 consecutive terms (r): ");
        int r = sc.nextInt();
        System.out.print("Which term you want to find (n): ");
        int n = sc.nextInt();
        int nth = a * (int) (Math.pow(r, n - 1));
        System.out.print(n + "th term of GP is: " + nth);
    }
}
