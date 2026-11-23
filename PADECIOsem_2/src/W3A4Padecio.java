import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class W3A4Padecio {
	public static void main(String args[]) {
		try (FileWriter writer =
				new FileWriter("Padeciop4.txt", true)){
			writer.write("\nToday I learned FileWriter.");
			System.out.println("New text added");
			
			
		} catch (IOException e) {
			System.out.println("Unable to update file");
		}
	}

}
