package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MultipleExceptions {
    public static void divide(int a, int b) {
        try {
            System.out.println(a + " / " + b + " = " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        try {
            divide(a, b);
            Scanner f = new Scanner(new File("Text.txt"));
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception caught...");
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception caught...");
        } catch (Exception e) {
            System.out.println("Unknown exception occurred");
        }
    }
}
