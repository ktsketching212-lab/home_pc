//importing the tools needed for the program
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;



public class W3E1Padecio {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			//user Input area 
			System.out.println("Choose an operation");
			System.out.println("(1) Input new student Record");
			System.out.println("(2) View Student Records");
			System.out.println("(3) Exit");
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
				
				try (FileWriter writer = new FileWriter("E1padecio.txt", true)){
					
					//writer area
					writer.write("\n | UID : " + StudNumber + " |  FullName :" + StudLast + ", " + StudFirst + " | Course :" + StudCourse);
					System.out.println("Student Recorded");
				
				} catch (IOException e) {
					System.out.println("File Write error");
				}
			}
			else if (input == 2) {
				try (FileReader reader = new FileReader("E1padecio.txt")){
		            int ch;
		            while((ch = reader.read()) != -1){
		                System.out.print((char) ch);
		            }

		        } catch (IOException e){
		            System.out.println("Error reading file");
		        }
			}
			else if (input == 3) {
				System.out.println("Exiting Program");
				break;
			}
			System.out.println("\n");
			
		}
		
		
		
	}

}
