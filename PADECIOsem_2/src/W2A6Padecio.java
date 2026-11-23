import java.util.ArrayList;

public class W2A6Padecio {
	public static void main(String[] args) {
		ArrayList<Integer> scores = new ArrayList<>();
		scores.add(85);
		scores.add(92);
		scores.add(78);
		scores.add(90);
		scores.add(88);
		
		int total = 0;
		int countAtLeast85 = 0;
		
		for (int i = 0; i < scores.size(); i++) {
			int score = scores.get(i);
			if (score >= 85) {
				countAtLeast85++;
			}
		}
		
		double average = (double) total / scores.size();
		
		System.out.println("Scores: " + scores);
		System.out.println("Total: " + total);
		System.out.println("Average: " + average);
		System.out.println("Scores at least 85: " + countAtLeast85);
		
	}
		

}
