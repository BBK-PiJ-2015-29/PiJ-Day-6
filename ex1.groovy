
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
	
	Calculator c1 = new Calculator();
	switch(choice) {
		case 1:
			resultInt = c1.addition(num1, num2);
			result = (double) resultInt;
			validChoice = true;
			break;
		case 2:
			//subtraction method
			resultInt = c1.subtraction(num1, num2);
			result = (double) resultInt;
			validChoice = true;
			break;
		case 3:
			//multiplication method
			resultInt = c1.multiplication(num1, num2);
			result = (double) resultInt;
			validChoice = true;
			break;
		case 4:
			//division method
			result = c1.division(num1, num2);
			validChoice = true;
			break;
		case 5:
			//modulus method
			resultInt = c1.modulus(num1, num2);
			result = (double) resultInt;
			validChoice = true;
			break;
		default:
			System.out.println("This is not a valid choice.");
			break;
	}
}
System.out.println("Result: " + result);
	
