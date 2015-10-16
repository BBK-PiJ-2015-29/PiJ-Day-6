public class Matrix {
	private int[][] array2d;

	public Matrix(int size1, int size2) {
		this.array2d = new int[size1][size2]; 
	}
	
	public int[][] getArray () {
		return array2d;
	}
	
	
	public void setElement(int posX, int posY, int value) {
		int columns = this.array2d.length;
		int rows = this.array2d[0].length;
		if((posX < columns) && (posY < rows)) {
			this.array2d[posX][posY] = value;	
		}
	}
	//Method to set entire row, as specified by user.
	public void setRow(int row, String input) {
		int rowLength = this.array2d.length;
		int lastRow = this.array2d[0].length;
		//Array to hold integers from input.
		int[] rowTemp = new int[rowLength];
		//String to hold only integers from String input.
		String number = ""; 
		String temp = "";
		int count = 0;
		int tempNum = 0;
		if(row < lastRow) {
			for(int i = 0; i < input.length(); i++) {
				temp = input.substring(i, i+1);
				char c = temp.charAt(0);
				if(Character.isDigit(c)) {
					// Check to see if we are at the last character, 
					// if so add it to the number string, parse the
					// string and add it to the rowTemp array
					if (i == (input.length() - 1)) {
						number = number.concat(temp);
						tempNum = Integer.parseInt(number);
						rowTemp[count] = tempNum;
						count++;
					}
					else {
					number = number.concat(temp);
					}
					
				}
				
				else if (temp.equals(",")) {
					// create code to add previous number to rowTemp array
					tempNum = Integer.parseInt(number);
					rowTemp[count] = tempNum;
					count++;
					number = "";		
				}
			}
		}
		else {
			System.out.println("That row doesn't exist in the matrix");
		}
		if (count <= rowLength) {
			this.array2d[row] = rowTemp;
		}
		else {
			System.out.println("Input string too long.");
			
		}
	}
	//create setColumn Method
	public void setColumn(int column, String input) {
		int columnLength = this.array2d[0].length;
		int lastColumn = this.array2d.length;
		// array to hold column values from input string
		int[] colTemp = new int[columnLength];
		//string to hold each input integer as it is read
		String number ="";
		String temp = "";
		// ints to hold each number parsed before being added to colTemp,
		// and to count the number of input variables
		int count = 0;
		int tempNum = 0;
		// check that intended column exists
		if (column < lastColumn) {
			for(int i = 0; i < input.length(); i++) {
				temp = input.substring(i, i+1);
				char c = temp.charAt(0);
				if(Character.isDigit(c)) {
					// Check to see if we are at the last character, 
					// if so add it to the number string, parse the
					// string and add it to the colTemp array
					if (i == (input.length() - 1)) {
						number = number.concat(temp);
						tempNum = Integer.parseInt(number);
						colTemp[count] = tempNum;
						count++;
					}
					else {
					number = number.concat(temp);
					}
					
				}
				
				else if (temp.equals(",")) {
					// create code to add previous number to colTemp array
					tempNum = Integer.parseInt(number);
					colTemp[count] = tempNum;
					count++;
					number = "";		
				}
			}
			
		}
		else {
			System.out.println("That column doesn't exist in the matrix");
		}
		//add colTemp to the matrix
		if (count <= columnLength){
			for (int i = 0; i < columnLength; i++) {
				this.array2d[i][column] = colTemp[i];				
			}
		}
		else {
			System.out.println("Input string too long.");
		}
	}
	public String toString() {
		String output = "[";
		//string to hold each element of the array as we loop through it
		String element = "";
		for (int i = 0; i < this.array2d.length; i++) {
			for (int j = 0; j < this.array2d[i].length; j++) {
				element = String.valueOf(this.array2d[i][j]);
				if (j < (this.array2d[i].length -1)) {
					output = output.concat(element + ",");
				}
				else {
					output = output.concat(element);
				}
				
			}
			if (i < (this.array2d.length -1)) {
				output = output.concat(";");	
			}
		}
		output = output.concat("]");
		return output;
	}
	
	public void prettyPrint() {
		for (int i = 0; i < this.array2d.length; i++) {
				for (int j = 0; j < this.array2d[i].length; j++) {
					System.out.print(this.array2d[i][j] + "\t");
				}
				System.out.println();
			}
	}
}