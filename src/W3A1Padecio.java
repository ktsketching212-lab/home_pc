import java.io.IOException;

import java.io.FileWriter;


public class W3A1Padecio {
    public static void main(String Args[]){
        
    	
    	
        try (FileWriter writer = new FileWriter("jayvee.txt")){
            writer.write("Welcome to Java File Handling");
            System.out.println("Text Succesfully Written");

            
        } catch (IOException e){
            System.out.println("Unable To Print");
        }

    }
}