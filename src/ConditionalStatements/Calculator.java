package ConditionalStatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ask;
        do {
            System.out.println("Enter two operands: ");
            System.out.print("a = ");
            int a = sc.nextInt();
            System.out.print("b = ");
            int b = sc.nextInt();
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> System.out.println(a + " + " + b + " = " + (a + b));
                case 2 -> System.out.println(a + " - " + b + " = " + (a - b));
                case 3 -> System.out.println(a + " X " + b + " = " + (a * b));
                case 4 -> System.out.println(a + " / " + b + " = " + (a / b));
                default -> System.out.println("Invalid choice");
            }
            System.out.print("Do you want to continue(y/n): ");
            ask = sc.next();
        } while (ask.equals("y") || ask.equals("Y"));
    }
}
