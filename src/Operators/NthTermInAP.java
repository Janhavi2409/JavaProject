package Operators;

import java.util.Scanner;

public class NthTermInAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter difference between two terms (d): ");
        int d = sc.nextInt();
        System.out.print("Which term you want to find (n): ");
        int n = sc.nextInt();
        int nth = a + ((n - 1) * d);
        System.out.print(n + "th term of th AP is: " + nth);
    }
}
