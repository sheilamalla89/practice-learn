package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("456678987", 1000.50);
		BankAccount acc2 = new BankAccount("123456789",2000);
		BankAccount acc3 = new BankAccount("020202021",3000);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(400);
		acc1.payBill(1000);
		acc1.accure();
		System.out.println(acc1.toString());
	}
}

class BankAccount implements IInterest{
	// Properties of a bank account
	static private int id = 1001; //  internal id
	private String accountNumber; // id  + random 2-digit number + first 2 of ssn
	private static final String routingNumber = "61076567";
	private String name;
	private String ssn;
	private double balance;
	
	//Constructor
	BankAccount(String ssn, double initDeposit){
		System.out.println("New Account Created");
		balance = initDeposit;
		this.ssn = ssn;
		id++;
		setAccountNumber();
		
	}
	
	private void setAccountNumber() {
		int random =(int) (Math.random()*100);
		System.out.println(random);
		accountNumber = id + random + ssn.substring(0,2);
		System.out.println("Your account number: "+accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: "+amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance +amount;
		System.out.println("Making deposit: "+ amount);
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: "+balance);
	}

	@Override
	public void accure() {
		balance = balance * (1+rate/100);
		showBalance();
	}
	
	public String toString() {
		System.out.println("-------------------------*---------------------------");
		return "[Name: "+name+"]\n[Account Number: "+accountNumber+"]\n"+"[Routing Number: "+routingNumber+"]\n "+"[Balance "+balance +"]";
	}
}
