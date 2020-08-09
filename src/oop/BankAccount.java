package oop;

public class BankAccount implements IRate {
	String AccountNumber;
	String routingNumber;
	private String ssn;
	
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void setRate() {
		System.out.println("SETTING RATE");
	};
	
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	};
	

	String AccountType;
	private String name;
	double balance;
	
	//Contructors definition : unique methods 
		// 1. used to define / set up / initialize properties of an object
		// 2. are IMPLICITY called upon instantiation 
		// 3. the same name as the class itself 
		// 4. has no return type
	
	BankAccount(){
		
		System.out.println("New Account created");
	}
	
	//Overloading : call same method name with different arguments
	
	BankAccount (String AccountType){
		System.out.println("New Account " + AccountType);
	}
	
	BankAccount (String AccountType, double initDeposit){
		System.out.println("New Account " + AccountType);
		System.out.println("Initial Deposit of: " + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			 Msg = "ERROR: Mininum deposit must be at least $1000" ;
		} else {
			 Msg = "Thanks for your initial deposit of: $ " + initDeposit ;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
		
	}
	
	//Getters and setters
	
	//Allow the user to define the name
	
	public void setname(String name) {
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	void deposit() {
	
	}
	
	void withdraw() {
		
	}
	
	private void showActivity() {
		System.out.println("Showing recent activity");

	}
	
	void checkBalance() {
		System.out.println("The balance is " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ " + name + ". " + AccountNumber + ". Balance: $" + balance + " ]";
	}
}
