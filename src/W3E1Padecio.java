//importing the tools needed for the program
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Scanner;

public class W3E1Padecio {
	public static void main(String args[]) {
		Scanner Padecio_sc = new Scanner(System.in);	
		while(true) {
			//user Input area 
			System.out.println("Choose an operation");
			System.out.println("(1) Input new student Record");
			System.out.println("(2) View Student Records");
			System.out.println("(3) Search Student Records");
			System.out.println("(4) Exit");
			System.out.print("> ");
			int Padecio_input = Padecio_sc.nextInt();
			Padecio_sc.nextLine();
	
			if (Padecio_input == 1) {
				//choice 1 area stud num full name and stud course
				System.out.print("Input student Number > ");
				String Padecio_StudNumber = Padecio_sc.nextLine();
				
				System.out.print("Input student Last Name > ");
				String Padecio_StudLast = Padecio_sc.nextLine();
				
				System.out.print("Input student First Name > ");
				String Padecio_StudFirst = Padecio_sc.nextLine();
				
				System.out.print("Input student Course > ");
				String Padecio_StudCourse = Padecio_sc.nextLine();
				
				try (FileWriter Padecio_writer = new FileWriter("E1padecio.txt", true)){
					
					//writer area
					Padecio_writer.write("\n" + Padecio_StudNumber + ", " + Padecio_StudLast + ", " + Padecio_StudFirst + ", " + Padecio_StudCourse);
					System.out.println("Student Recorded");
				
				} catch (IOException e) {
					System.out.println("File Write error");
				}
			}
			else if (Padecio_input == 2) {
				//inputs every line of saved user data
				try (FileReader Padecio_reader = new FileReader("E1padecio.txt")){
		            int Padecio_ch;
		            while((Padecio_ch = Padecio_reader.read()) != -1){
		                System.out.print((char) Padecio_ch);
		            }

		        } catch (IOException e){
		            System.out.println("Error reading file");
		        }
			}	
			else if (Padecio_input == 3) {
				//Search area
				System.out.print("Input the student ID > ");
				String Padecio_searchID = Padecio_sc.nextLine();
				boolean Padecio_found = false;

				//Buffer reader for code 
				try (BufferedReader Padecio_reader = new BufferedReader(new FileReader("E1padecio.txt"))){
						
					String Padecio_line;
					while ((Padecio_line = Padecio_reader.readLine()) != null) {
						String[] Padecio_record = Padecio_line.split(", ");
						
						//check if it is equals to record inputed by user
						if (Padecio_record.length >= 3 && Padecio_record[0].trim().equalsIgnoreCase(Padecio_searchID.trim())) {
							System.out.println("\n");
							System.out.println("Student Found");
							System.out.println("UID : " + Padecio_record[0].trim());
							System.out.println("Name : " + Padecio_record[1].trim());
							System.out.println("Course : " + Padecio_record[2].trim());
							System.out.println("Year Level : " + Padecio_record[3].trim());
							System.out.println(" ");
						}
					}
				} catch (IOException e){
					System.out.println("Error reading file");
				}
				
			}
			//kill the program exits it
			else if (Padecio_input == 4) {
				System.out.println("Exiting Program");
				break;
			}
		}	
	}
}
