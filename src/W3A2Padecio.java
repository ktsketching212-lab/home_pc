import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;


public class W3A2Padecio {
    public static void main(String Args[]){


        try (FileReader reader = new FileReader("jayvee.txt")){
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }

        } catch (IOException e){
            System.out.println("Error reading file");
        }

    }
}