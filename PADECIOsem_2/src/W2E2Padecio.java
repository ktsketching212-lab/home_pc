public class W2E2Padecio {
	public static void main(String Args[]) {	
		int[][] Padecio_matrix = {
				{1,1,1,0},
				{1,1,0,0},
				{0,0,1,1},
				{0,0,1,1}
		};
		int Padecio_numZero = 0;
		int Padecio_numOnes = 0;
	
		int Padecio_CalCounter = 0;
		int Padecio_BiggestRow = 0;
		
		System.out.println("Original Matrix yes");
		for (int Padecio_row = 0; Padecio_row < Padecio_matrix.length; Padecio_row++) {		
			int Padecio_oneCount = 0;
			System.out.println("");
			for (int Padecio_col = 0; Padecio_col < Padecio_matrix[Padecio_row].length; Padecio_col++) {
				//zero counter
				if (Padecio_matrix[Padecio_row][Padecio_col] == 0) {
					Padecio_numZero +=1;			
				}
				//one counter area 
				if (Padecio_matrix[Padecio_row][Padecio_col] == 1) {
					Padecio_numOnes +=1;	
					if (Padecio_matrix[Padecio_row][Padecio_col] == 1) {
						Padecio_oneCount +=1;		
					}	
					//Biggest Row Checker
					if (Padecio_oneCount > Padecio_CalCounter) {
						Padecio_CalCounter = Padecio_oneCount;
						Padecio_BiggestRow = Padecio_row;
					}
				}		
				System.out.print("" + Padecio_matrix[Padecio_row][Padecio_col] + " ");
			}
		}
		System.out.println("\n");
		System.out.println("Problem 2 : Binary Matrix Analyzer");
		System.out.printf("Number of Zeros : %d", Padecio_numZero);
		System.out.printf("\nNumber of Ones : %d", Padecio_numOnes);
		System.out.printf("\nRow That Contains the most ones #%d", (Padecio_BiggestRow + 1));
	}
}
