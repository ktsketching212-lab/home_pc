import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;


public class FileReading {
    public static void main(String Args[]){


        try (FileReader reader = new FileReader("sample.txt")){
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }

        } catch (IOException e){
            System.out.println("Error reading file");
        }

    }
}
