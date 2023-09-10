package Input;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + " b = " + b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("After swapping: a = " + a + " b = " + b);
    }
}
