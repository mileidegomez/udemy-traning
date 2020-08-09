package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("4653298743", 1000);
		BankAccount acc2 = new BankAccount("4345679841", 2000);
		BankAccount acc3 = new BankAccount("4876532344", 3500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(5000);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());

	}


}

class BankAccount implements IInterest{
	private static int id = 1000; // internal id
	private String accountNumber; // id + random 2-digit number + first 2 of ssn
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor	
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN; 
		id++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		System.out.println(random);
		accountNumber = id + "" + random + SSN.substring(0, 2); 
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		System.out.println("Pay Bill: " + amount);
		balance = balance - amount ;
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		System.out.println("Make Deposit: " + amount);
		balance = balance + amount ;
		showBalance();
	}
	
	public void showBalance(){
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
		// TODO Auto-generated method stub
		balance = balance * (rate/100) ; // rate come from interface
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: "+ name + " ]\n [Accout Number:" + accountNumber + "]\n" + "[Routing Number:" + routingNumber + "]\n" + "[Balance: " + balance + "]" ;
	}
	
}