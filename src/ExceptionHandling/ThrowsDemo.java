package ExceptionHandling;

import java.util.Scanner;

public class ThrowsDemo {
    public static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        System.out.println("Exit from divide() method...");
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        try {
            System.out.println(a + " / " + b + " = " + divide(a, b));
            System.out.println("Exit try from main()...");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught...");
            e.printStackTrace();
        }
        System.out.println("Program executed successfully...");
    }
}
