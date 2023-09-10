package ExceptionHandling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class UserDefinedException {
    public static void withdrawMoney(int balance) throws InsufficientBalanceException {
        if (balance < 0) {
            throw new InsufficientBalanceException("You have insufficient balance...");
        }
        System.out.print("Balance after withdrawal: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int current = 1000;
        System.out.println("Enter current balance: " + current);
        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();
        int balance = current - withdraw;
        try {
            withdrawMoney(balance);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }
}
