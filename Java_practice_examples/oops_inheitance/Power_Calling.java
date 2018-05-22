package oops_inheitance;

public class Power_Calling {
	public static void main(String[] args) {
		Calculator.powerInt(10, 3);
		Calculator.powerDouble(12, 22);
		Calculator.display();
	}

}

class Calculator{
	static double result;
	static double result1;
	static void powerInt(int num1,int num2) {
		 result= Math.pow(num1, num2);
	}
	static void powerDouble(double num1,int num2) {
		result1= Math.pow(num1, num2);
	}
	static void display() {
		System.out.println(result);
		System.out.println(result1);
	}
}

// Static helps in not creating object 
//We can direvtly call like in 5,6,7th Statement
