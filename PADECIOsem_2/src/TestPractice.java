import java.util.ArrayList;


public class TestPractice {
	public static void main(String args[]) {
		
		
		ArrayList<String> test = new ArrayList();
		
		test.add("Loren");
		test.add("Laput");
		test.add("Jones");
		test.add("Bawi");
		test.add("Padecio");
		
	
		for (int i = 0; i < test.size(); i++) {
			System.out.printf("\n#%d %s - %s", i + 1 , test.get(i), 
					(test.get(i).equals("Loren")) ? "Adult": "Minor" );
			
				
		}
	}

}
