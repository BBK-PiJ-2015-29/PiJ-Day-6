public class Calculator {
	
	//define addition method.
		public int addition(int num1, int num2) {
			int output = num1 + num2;
			return output;
		}
		
		//define subtraction method.
		public int subtraction(int num1, int num2) {
			int output = num1 - num2;
			return output;
		}
		
		//define multiplication method.
		public int multiplication(int num1, int num2) {
			int output = num1 * num2;
			return output;
		}
		
		//define division method.
		public double division(int num1, int num2) {
			double d1 = (double) num1;
			double d2 = (double) num2;
			double output = d1 / d2;
			return output;
		}
		
		//define modulus method.
		public int modulus(int num1, int num2) {
			int output = num1 % num2;
			return output;
		}
}