package ConditionalStatements;

import java.util.Scanner;

public class LargestOfThreeNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = sc.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.print(n1 + " is greater than " + n2 + " & " + n3);
        } else if (n2 > n1 && n2 > n3) {
            System.out.print(n2 + " is greater than " + n1 + " & " + n3);
        } else if (n3 > n1 && n3 > n2) {
            System.out.print(n3 + " is greater than " + n1 + " & " + n2);
        } else {
            System.out.print(n1 + ", " + n2 + " & " + n3 + " are equal");
        }
    }
}
