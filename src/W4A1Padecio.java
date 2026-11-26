
import java.util.Scanner;

public class W4A1Padecio {
	static void Padecio_operations() {
		System.out.println("Addition = + ");
		System.out.println("Multiplication = *");
		System.out.println("Subtraction = -");
		System.out.println("Division = /");	
		System.out.println("Exit = e");	
	}
	
	static void Padecio_addNumbers(double num1, double num2) {
		double sum = num1 + num2;
		System.out.printf("\nthe ans of %.0f + %.0f = %.2f", num1, num2, sum);
	}
	static void Padecio_subtract(double num1, double num2) {
		double sum = num1 - num2;
		System.out.printf("\\nthe ans of %.0f - %.0f = %.2f", num1, num2, sum);
	}
	static void Padecio_multiply(double num1, double num2) {
		double sum = num1 * num2;
		System.out.printf("\\nthe ans of %.0f * %.0f = %.2f", num1, num2, sum);
	}
	static void Padecio_divide(double num1, double num2) {
		double sum = num1 / num2;
		System.out.printf("\\nthe ans of %.0f / %.0f = %.2f", num1, num2, sum);
	}
	
	public static void main(String[] args) {
		while(true) {
			Scanner Padecio_sc = new Scanner(System.in);
			Padecio_operations();
			System.out.print("Input the operation > ");
			String Padecio_opt = Padecio_sc.nextLine();
			
			if (Padecio_opt.equalsIgnoreCase("e")) {
				System.out.println("Exiting");
				break;
			}
			System.out.print("\nInput first num > ");
			double Padecio_num1 = Padecio_sc.nextDouble();
			System.out.print("Input second num > ");
			double Padecio_num2 = Padecio_sc.nextDouble();
			
			if (Padecio_opt.equals("+")) {
				Padecio_addNumbers(Padecio_num1, Padecio_num2);
			}
			else if (Padecio_opt.equals("-")) {
				Padecio_subtract(Padecio_num1, Padecio_num2);
			}
			else if (Padecio_opt.equals("*")) {
				Padecio_multiply(Padecio_num1, Padecio_num2);
			}
			else if (Padecio_opt.equals("/")) {
				Padecio_divide(Padecio_num1, Padecio_num2);
			}
			else {
				System.out.println("invalid operation");
			}
			System.out.println("");
		}
	}

}
