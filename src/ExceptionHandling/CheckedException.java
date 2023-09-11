package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("text.txt"));
            System.out.println("If no exception occurs, this statement will be executed");
        } catch (FileNotFoundException f) {
            System.out.println("File not found...");
        } finally {
            System.out.println("In finally block...");
        }
        System.out.println("After try, catch & finally block");
    }
}
//Complie time exception