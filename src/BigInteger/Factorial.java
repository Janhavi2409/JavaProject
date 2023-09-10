package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static BigInteger factorial(int n) {
        BigInteger ans = new BigInteger("1");
        for (int i = n; i > 1; i--) {
            BigInteger x = BigInteger.valueOf(i);
            ans = ans.multiply(x);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(n + "! = " + factorial(n));
    }
}