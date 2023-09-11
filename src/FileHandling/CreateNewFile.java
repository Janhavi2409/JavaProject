package FileHandling;

import java.io.File;

public class CreateNewFile {
    public static void main(String[] args) {
        try {
            File obj = new File("File1.txt");
            if (obj.createNewFile()) {
                System.out.print(obj.getName());
            } else {
                System.out.println("File already exists...");
            }
        } catch (Exception e) {
            System.out.print("An error occurred");
        }
    }
}
