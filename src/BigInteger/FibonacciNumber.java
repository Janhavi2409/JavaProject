package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciNumber {
    public static BigInteger fibNum(int n) {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c;
        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print(n + "th fibonacci number = " + fibNum(n));
    }
}
