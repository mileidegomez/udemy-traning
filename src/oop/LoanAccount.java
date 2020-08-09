package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Rate");
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		System.out.println("Increase Rate");
	}
	
	public void setTerm(int terms) {
		System.out.println("Set the term to " + terms + " years.");
	}
	
	public void setAmortSchedule() {
		System.out.println("Amortization schedule");
	}
}
