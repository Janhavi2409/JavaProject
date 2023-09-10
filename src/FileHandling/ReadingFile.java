package FileHandling;

import java.io.FileReader;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) {
        try{
            FileReader f = new FileReader("Write.txt");
            Scanner myReader = new Scanner(f);
            while(myReader.hasNext()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }catch (Exception e){
            System.out.println("An error occurred");
        }
    }
}
