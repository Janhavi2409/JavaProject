package ConditionalStatements;

import java.util.Scanner;

public class CheckIfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime or not: ");
        int n = sc.nextInt();
        boolean flag = false;
        if (n == 1) {
            System.out.print(n + " is not a prime number.");
        } else if (n == 2) {
            System.out.print(n + " is a prime number.");
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.print(n + " is not a prime number.");
            } else {
                System.out.print(n + " is a prime number.");
            }
        }
    }
}
