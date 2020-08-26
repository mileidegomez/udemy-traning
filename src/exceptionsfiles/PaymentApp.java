package exceptionsfiles;

import java.util.Scanner;

public class PaymentApp {
	
	
	// Take a payment from a user
	public static void main(String[] args) {
		double payment = 0;
		boolean positivePayment = true;
		
		do {
		
		// 1. Ask the user for input
			
		System.out.print("Enter the payment amount: ");
			
		// 2. get the amount and test the value
		Scanner in = new Scanner(System.in);
		
		// 3. Handle exceptions appropriately
		try {
			payment = in.nextDouble();
			
			if (payment < 0) {
				// throw error
				throw new NegativePaymentException(payment);
			}
			else {
				positivePayment = true;
			}
				
		} catch (NegativePaymentException e) {// exception
			System.out.println(e.toString()) ;
			System.out.println("Please try again");
			positivePayment = false;
			}
		} while(!positivePayment);
		
		
		// 4. print the confirmation
		System.out.println("THank you for your payment of $ " + payment);
	}

}
