package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNo {
    public static boolean isPrime(int n) {
        BigInteger b = BigInteger.valueOf(n);
        return b.isProbablePrime(1);
    }

    public static int nextPrime(int n) {
        BigInteger b = BigInteger.valueOf(n);
        String a = b.nextProbablePrime().toString();
        return Integer.parseInt(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
        System.out.print("Next probable prime number to " + n + " is: " + nextPrime(n));
    }
}
