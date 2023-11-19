package ExceptionHandling;

import java.util.Scanner;
public class DivideTwoNums {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String[] arr = new String[2];
            for (int i = 0; i < 2; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.next();
            }
            int div = Integer.parseInt(arr[0]) / Integer.parseInt(arr[1]);
            System.out.println(arr[0] + " / " + arr[1] + " = " + (div));
        } catch (NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
        }
    }
}