package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		
		
		//  acc1.accHolderName = "Test1"; 
		  acc1.accType = "Saving"; 
		  acc1.accNumber = "1234567890";
		  acc1.deposit("Saving", 6000);
		 
		System.out.println(acc1.toString());
		
		// demo for inheritance
		// since class CDAccount extends BankAcount. Because of which CDAccount inherits all the methods and variable of BankAccount class and Object class
		CDAccount cdAccount1 = new CDAccount();
		cdAccount1.balance = 5000;
	//	cdAccount1.accHolderName ="Jone";
		cdAccount1.interestRate = "4.5";
		cdAccount1.compound();
		
		System.out.println(cdAccount1.toString());
		
		System.out.println("------------------*--------------------");
		acc1.setName("Sunny");
		acc1.setRate();
		System.out.println("Account Holder name: "+acc1.getName());
	}
}
