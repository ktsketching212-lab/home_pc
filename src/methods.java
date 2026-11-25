//importing the tools needed for the program
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

public class methods {
	static void newStudent(String StudNumber, String StudLast, String StudFirst, String StudCourse) {
		try (FileWriter writer = new FileWriter("E1padecio.txt", true)){
			
			//writer area
			writer.write("\n" + StudNumber + ", " + StudLast + ", " + StudFirst + ", " + StudCourse);
			System.out.println("Student Recorded");
		
		} catch (IOException e) {
			System.out.println("File Write error");
		}
	}
	
	static void viewRecords() {
		//inputs every line of saved user data
		try (FileReader reader = new FileReader("E1padecio.txt")){
            int ch;
            while((ch = reader.read()) != -1){
                System.out.print((char) ch);
            }

        } catch (IOException e){
            System.out.println("Error reading file");
        }
	}
	
	static void search(String searchID) {
		//Buffer reader for code 
		try (BufferedReader reader = new BufferedReader(new FileReader("E1padecio.txt"))){		
			String line;
			while ((line = reader.readLine()) != null) {
				String[] record = line.split(", ");
				
				//check if it is equals to record inputed by user
				if (record.length >= 3 && record[0].trim().equalsIgnoreCase(searchID.trim())) {
					System.out.println("\n");
					System.out.println("Student Found");
					System.out.println("UID : " + record[0].trim());
					System.out.println("Name : " + record[1].trim());
					System.out.println("Course : " + record[2].trim());
					System.out.println("Year Level : " + record[3].trim());
					System.out.println(" ");
				}
			}
		} catch (IOException e){
			System.out.println("Error reading file");
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);	
		while(true) {
			//user Input area 
			System.out.println("Choose an operation");
			System.out.println("(1) Input new student Record");
			System.out.println("(2) View Student Records");
			System.out.println("(3) Search Student Records");
			System.out.println("(4) Exit");
			System.out.print("> ");
			int input = sc.nextInt();
			sc.nextLine();
	
			if (input == 1) {
				//choice 1 area stud num full name and stud course
				System.out.print("Input student Number > ");
				String StudNumber = sc.nextLine();
				
				System.out.print("Input student Last Name > ");
				String StudLast = sc.nextLine();
				
				System.out.print("Input student First Name > ");
				String StudFirst = sc.nextLine();
				
				System.out.print("Input student Course > ");
				String StudCourse = sc.nextLine();
				newStudent(StudNumber, StudLast , StudFirst , StudCourse);
				
			}
			else if (input == 2) {
				viewRecords();
			}	
			else if (input == 3) {
				//Search area
				System.out.print("Input the student ID > ");
				String searchID = sc.nextLine();
				boolean found = false;
				search(searchID);
			}
			//kill the program exits it
			else if (input == 4) {
				System.out.println("Exiting Program");
				break;
			}
		}	
	}
}