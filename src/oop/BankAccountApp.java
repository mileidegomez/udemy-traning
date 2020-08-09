package oop;

public class BankAccountApp {
	public static void main (String[] args) {
		
		//Creating a new bankAccount  >> Think instantiate an object
		BankAccount acc1 = new BankAccount();
		acc1.AccountNumber = "0123456";
		
		acc1.setname("Carl Hue");
		System.out.println(acc1.getname());
		
		acc1.setSsn("123456");
		System.out.println(acc1.getSsn());
		
		acc1.setRate();
		acc1.increaseRate();
		
		/* acc1.balance = 1000;
		
		// Polymorphism through overriding 
		System.out.println(acc1.toString());
		
		*/
		
		// Polymorphism through overloading 
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.AccountNumber = "012345";
		
		BankAccount acc3 = new BankAccount("Saving Account", 5000);
		acc3.AccountNumber = "011145";
		
		
		/*
		acc3.checkBalance();
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.AccountType = "CDAccount"; 
		*/
	}

}
