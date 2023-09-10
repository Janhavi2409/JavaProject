package Loops;

import java.util.Scanner;

public class LCMOfTwoNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        int x = Math.max(num1, num2);
        int y = num1 * num2;
        int lcm = x;
        for (int i = x; i <= y; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                lcm = i;
                break;
            }
        }
        System.out.print("LCM of " + num1 + " & " + num2 + " = " + lcm);
    }
}
