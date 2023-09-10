package FileHandling;

import java.io.FileWriter;

public class WritingInFile {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("Write.txt");
            f.write("Java is a programming language");
            f.close();
            System.out.println("Task completed successfully");
        } catch (Exception e) {
            System.out.println("An error occurred");
        }
    }
}
