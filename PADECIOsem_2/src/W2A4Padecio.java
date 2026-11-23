
import java.util.ArrayList;


public class W2A4Padecio {
	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		
		students.add("Alex");
		students.add("Ben");
		students.add("Carlo");
		
		System.out.println("Student List: ");
		for (int i = 0; i < students.size(); i++) {
			System.out.println((i + 1)+ " " + students.get(i));
		}
		
		students.set(1, "Bianca");
		System.out.println("\nAfter updating the second name:");
		System.out.println(students);
		
		System.out.println("\nIs Carlo in the list? "
				+ students.contains("Carlo"));
		
	}

}
