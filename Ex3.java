public class Ex3 {
	public static void main(String[] args) {
		Matrix m1 = new Matrix(3, 3);
		
		System.out.println("We have an integer Matrix of 3 by 3");
		
		
		
		boolean validInput = false;
		while (!validInput) {
			System.out.println("What do you want to do with the Matrix");
			System.out.println("1 - add an element to the matrix?");
			System.out.println("2 - add an entire row to the matrix?");
			System.out.print("> ");
			
			String input = System.console().readLine();
			int choice = Integer.parseInt(input);
			int row = 0;
			int col = 0;
			switch (choice) {
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
					validInput = true;
					break;
				
				case 2:
					System.out.println("Which row?");
					System.out.print("> ");
					input = System.console().readLine();
					row = Integer.parseInt(input);
					
					System.out.println("Please enter 3 integers, separated by \',\'");
					System.out.print("> ");
					String rowValues = System.console().readLine();
					
					m1.setRow(row, rowValues);
					validInput = true;
					break;
					
				default:
					System.out.println("Not a valid input");
					
			}
		}
		for (int i = 0; i < m1.getArray().length; i++) {
            for (int j = 0; j < m1.getArray()[i].length; j++) {
            System.out.print(m1.getArray()[i][j] + " ");
            }
            System.out.println();
        }
		
	}
}