package exceptionsfiles;

public class NegativePaymentException extends Exception {
	
	double payment;
	
	//1. Constructor that takes the value that would threw the exception
	//2. Assign value of a local variable to a class variable
	public NegativePaymentException(double payment) {
		//System.out.println ("ERROR: negative payment");
		this.payment = payment;
	}
	
	// 3. Override the toString() method to include the specific exception message
	public String toString() {
		return "ERROR: Cannot take negative payment " + payment;
	}

}
