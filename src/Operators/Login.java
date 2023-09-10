package Operators;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("               Register               ");
        System.out.print("Enter Username you want to set: ");
        String username = sc.next();
        System.out.print("Enter Password you want to set: ");
        String password = sc.next();
        System.out.println("------------------------------------------");
        System.out.println("                Login                 ");
        System.out.print("Enter Username: ");
        String inUsername = sc.next();
        System.out.print("Enter Password: ");
        String inPassword = sc.next();
        if (inUsername.equals(username) && inPassword.equals(password)) {
            System.out.println("Welcome");
        } else if (inUsername.equals(username)) {
            System.out.println("Incorrect password");
        } else if (inPassword.equals(password)) {
            System.out.println("Incorrect username");
        } else {
            System.out.println("Invalid username and password");
        }
    }
}
