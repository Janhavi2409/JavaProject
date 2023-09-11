package Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digits = 0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int x = n;
        while (x > 0) {
            x /= 10;
            digits++;
        }
        System.out.println(n + " contains " + digits + " digits");
    }
}
