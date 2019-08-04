package oop;

public class AccountApp {
	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.setMortSchedule();
		la.setTerm(20);
	// Polymorphism because  we are changes where we are pointing
	// creating variable "loanAccount" based on the property of interface "LoanAccount"
	// but it will point loan account
		IRate loanAccount = new LoanAccount();
		loanAccount.increaseRate();
		loanAccount.setRate();
		
	}

}
