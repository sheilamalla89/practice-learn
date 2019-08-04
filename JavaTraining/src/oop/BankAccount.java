package oop;

public class BankAccount implements IRate {
	
	String accType;
	String accNumber;
	final static String routingNumber = "54212345";
	private String accHolderName;
	int balance = 1000;
	String status = "Inactive";
	
	public BankAccount() {
		accType = "Checking";
		accHolderName = "test";
		accNumber="13892648963";
		
	}

	public BankAccount(String accType) {
		System.out.println("NEW ACCOUNT: "+accType);
	}
	
	//Getters and setters
	
	public void setName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	
	public String getName() {
		return accHolderName;
	}
	
	public void deposit(String accType,int depositAmount) {
		System.out.println("---------------------------*--------------------------");
		System.out.println("Total deposited amount: $"+depositAmount);
		balance = balance + depositAmount;
		checkBalance();
		accStatus("Active");
		System.out.println("Account Number: "+accNumber);
		System.out.println("---------------------------*--------------------------");
		
	}
	
	public void withdrawn(int withdrawAmt) {
		System.out.println("---------------------------*--------------------------");
		System.out.println("Total withdrawn amount is $"+withdrawAmt);
		balance = balance - withdrawAmt;
		checkBalance();
		accStatus("Active");
		System.out.println("Account Number: "+accNumber);
		System.out.println("---------------------------*--------------------------");
	}
	
	private void checkBalance() {
		System.out.println("Total account balance: $"+ balance);
	}
	
	private void accStatus(String curStatus) {
		status = curStatus;
		System.out.println("Current account Status: "+status);
	}
	
	
	  public String toString() { 
		  String result = "Account Holder Name: "+accHolderName+"; Account Type: "
	  +accType+"; Account Number: "+accNumber; 
		  return result; }

	@Override
	public void setRate() {
		System.out.println("Setting rate....");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increasing rate...");
		
	}
	 

}