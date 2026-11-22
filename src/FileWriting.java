import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;


public class FileWriting {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Input words : ");
        String userInput = sc.nextLine();
        try (FileWriter writer = new FileWriter("sample.txt")){
            writer.write(userInput);
            System.out.println("Text Written");

        } catch (IOException e){
            System.out.println("Unable To Print");
        }


    }
}
