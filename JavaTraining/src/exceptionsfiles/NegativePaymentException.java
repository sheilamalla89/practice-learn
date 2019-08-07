package exceptionsfiles;

public class NegativePaymentException extends Exception{
	 
	double amount;
	public NegativePaymentException(double amount) {
		//System.out.println("Error: negative payment "+amount);
		this.amount = amount;
	}
	
	public String toString()
	{ 
		return "Error: Cannot take negative payment "+amount;
	}
	
	

}
