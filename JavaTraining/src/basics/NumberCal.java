package basics;

public class NumberCal {
	public static void main(String[] args) {
		System.out.println("Program is starting...");
		printName();
		int num1 = 10;
		int num2 = 20;
		addNumbers(num1,num2);
		int mulitplyResult = multiplyNumbers(num1,num2);
		System.out.println("The product of "+num1+" and "+num2+" is "+mulitplyResult);
	}

	


static void printName() {
	System.out.println("My name is Sam");
}

static void addNumbers(int number1,int number2) {
	int sum = number1 + number2;
	System.out.println("The sum of numbers "+number1 +" and "+number2+ " is"+sum);
}

static int multiplyNumbers(int numA,int numB) {
	int product = numA * numB;
	return product;
}
}