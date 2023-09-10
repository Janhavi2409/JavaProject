package Functions;

import java.util.Scanner;

public class FirstDigitOfANumber {
    public static int firstNo(int n) {
        while (n >= 10) {
            n = n / 10;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("First digit of " + n + " is: " + firstNo(n));
    }
}
