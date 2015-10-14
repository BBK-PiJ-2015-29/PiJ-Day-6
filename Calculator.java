public class Calculator {
	public static void main(String[] args){
		System.out.println("Please insert first integer:");
		System.out.print("> ");
		String input = System.console().readLine();
		int num1 = Integer.parseInt(input);
		
		System.out.println("Please insert second integer:");
		System.out.print("> ");
		input = System.console().readLine();
		int num2 = Integer.parseInt(input);
		
		double result = 0;
		int resultInt = 0;
		
		boolean validChoice = false;
		while(!validChoice) {
			System.out.println("\nPlease choose option from menu below:");
			System.out.println("Add:      1");
			System.out.println("Subtract: 2");
			System.out.println("Multiply: 3");
			System.out.println("Divide:   4");
			System.out.println("Modulus:  5");
			System.out.print("> ");
			input = System.console().readLine();
			int choice = Integer.parseInt(input);
			
			switch(choice) {
				case 1:
					resultInt = addition(num1, num2);
					result = (double) resultInt;
					validChoice = true;
					break;
				case 2:
					//subtraction method
					resultInt = subtraction(num1, num2);
					result = (double) resultInt;
					validChoice = true;
					break;
				case 3:
					//multiplication method
					resultInt = multiplication(num1, num2);
					result = (double) resultInt;
					validChoice = true;
					break;
				case 4:
					//division method
					result = division(num1, num2);
					validChoice = true;
					break;
				case 5:
					//modulus method
					resultInt = modulus(num1, num2);
					result = (double) resultInt;
					validChoice = true;
					break;
				default:
					System.out.println("This is not a valid choice.");
					break;
			}
		}
		System.out.println("Result: " + result);
	
	}
	//define addition method.
		private static int addition(int num1, int num2) {
			int output = num1 + num2;
			return output;
		}
		
		//define subtraction method.
		private static int subtraction(int num1, int num2) {
			int output = num1 - num2;
			return output;
		}
		
		//define multiplication method.
		private static int multiplication(int num1, int num2) {
			int output = num1 * num2;
			return output;
		}
		
		//define division method.
		private static double division(int num1, int num2) {
			double d1 = (double) num1;
			double d2 = (double) num2;
			double output = d1 / d2;
			return output;
		}
		
		//define modulus method.
		private static int modulus(int num1, int num2) {
			int output = num1 % num2;
			return output;
		}
}