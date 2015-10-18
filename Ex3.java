public class Ex3 {
	public static void main(String[] args) {
		Matrix m1 = new Matrix(3, 3);
		MatrixChecker check = new MatrixChecker();
		
		System.out.println("We have an integer Matrix of 3 by 3");

		boolean validInput = false;
		while (!validInput) {
			System.out.println("What do you want to do with the Matrix");
			System.out.println("1 - add an element to the matrix?");
			System.out.println("2 - add an entire row to the matrix?");
			System.out.println("3 - add an entire column to the matrix?");
			System.out.println("4 - print the matrix as a single line");
			System.out.println("5 - print the matrix as a grid");
			System.out.println("6 - add an entire matrix from a string");
			System.out.println("7 - check if an int[] input is symmetrical");
			System.out.println("8 - check if an int[][] input is symmetrical");
			System.out.println("0 - Exit");
			System.out.print("> ");
			
			String input = System.console().readLine();
			int choice = Integer.parseInt(input);
			int row = 0;
			int col = 0;
			String rowValues = "";
			String colValues = "";
			boolean symmetrical = true;
			switch (choice) {
				case 0: 
					System.exit(0);
					break;
				case 1:
					System.out.println("Which row?");
					System.out.print("> ");
					input = System.console().readLine();
					row = Integer.parseInt(input);
					
					System.out.println("Which column?");
					System.out.print("> ");
					input = System.console().readLine();
					col = Integer.parseInt(input);
					
					System.out.println("What integer do you want in the element?");
					System.out.print("> ");
					input = System.console().readLine();
					int value = Integer.parseInt(input);
					
					m1.setElement(row, col, value);
					
					break;
				
				case 2:
					System.out.println("Which row?");
					System.out.print("> ");
					input = System.console().readLine();
					row = Integer.parseInt(input);
					
					System.out.println("Please enter 3 integers, separated by \',\'");
					System.out.print("> ");
					rowValues = System.console().readLine();
					
					m1.setRow(row, rowValues);
					
					break;
				
				case 3: 
					System.out.println("Which column?");
					System.out.print("> ");
					input = System.console().readLine();
					col = Integer.parseInt(input);
					
					System.out.println("Please enter 3 integers, separated by \',\'");
					System.out.print("> ");
					colValues = System.console().readLine();
					
					m1.setColumn(col, colValues);
					break;
				
				case 4: 
					System.out.println(m1.toString());
					break;
				
				case 5:
					m1.prettyPrint();	
					break;
				
				case 6: 
					System.out.println("Input matrix, elements separated by \',\'s and\nrows separated by \';\'s");
					System.out.print("> ");
					input = System.console().readLine();
					m1.setMatrix(input);
					break;
					
				case 7:
					System.out.println("Please input int[] to be checked,ints separated by commas");
					System.out.print("> ");
					input = System.console().readLine();
					
					String[] holder = input.split(",");
					int[] inputIntArray = new int[holder.length];
					for (int i = 0; i < holder.length; i++) {
						inputIntArray[i] = Integer.parseInt(holder[i]);
					}
					
					symmetrical = check.isSymmetrical(inputIntArray);
					if (symmetrical) {
						System.out.println("The input int[] is symmetrical\n");
					}
					else {
						System.out.println("The input int[] is not symmetrical\n");
					}
					break;
					
				case 8:
					System.out.println("Input int[][], elements separated by \',\'s and\nrows separated by \';\'s");
					System.out.print("> ");
					input = System.console().readLine();
					m1.setMatrix(input);
					symmetrical = check.isSymmetrical(m1.getArray());
					if (symmetrical) {
						System.out.println("The input int[] is symmetrical\n");
					}
					else {
						System.out.println("The input int[] is not symmetrical\n");
					}
					break;
					
				default:
					System.out.println("Not a valid input");
					
			}
		}

		
	}
}