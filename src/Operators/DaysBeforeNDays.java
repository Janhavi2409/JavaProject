package Operators;

import java.util.Scanner;

public class DaysBeforeNDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("0. Sunday");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.println("6. Saturday");
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int x = n % 7;
        int day = d - x;
        if (day < 0) {
            System.out.print(day + 7);
        } else {
            System.out.print(day);
        }
    }
}
