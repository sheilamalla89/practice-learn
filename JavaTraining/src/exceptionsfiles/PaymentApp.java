package exceptionsfiles;

import java.util.Scanner;

public class PaymentApp {

	public static void main(String[] args) {
		boolean isNegativePayment = true;

		do 
		{
	
		System.out.print("Enter payment amount: ");
		Scanner scan = new Scanner(System.in);
		
		try {
		double amount = scan.nextDouble();
			if(amount <0) {
				throw new NegativePaymentException(amount);
			}
			else {
				isNegativePayment = false;
			}
		}
		catch(NegativePaymentException e) {
			System.out.println("Error: Cannot enter negative amount");
			System.out.println(e.toString());
			System.out.println("Please enter positive amount.");
		}
		}
		while(isNegativePayment);
	System.out.println("Program ended.");	
	}

}
