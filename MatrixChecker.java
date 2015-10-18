public class MatrixChecker {

	public boolean isSymmetrical(int[] input) {
		//to check if an array is symmetrical, compare the value at index 0 with the value
		//at index length-1, then the value at index 1 with the value at index length-2 etc.
		
		boolean symmetrical = true;
		for (int i = 0; i < input.length; i++) {
			if (input[i] != input[(input.length - 1) - i]) {
				symmetrical = false;
				break;
			}
			
		}
		return symmetrical;
	}
	
	public boolean isSymmetrical(int[][] input) {
		boolean symmetrical = true;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				if (input[i][j] != input[j][i]) {
					symmetrical = false;
					break;
				}
			}	
		}
		return symmetrical;
	}
	
	public boolean isTriangular(int[][] input) {
		boolean triangular = true;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				if (i < j) {
					if (input[i][j] != 0) {
						triangular = false;
						break;
					}
				}
			}	
		}
		return triangular;
	}
}