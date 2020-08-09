package basics;

public class SalaryCalculator {
	public static void main (String[] args) {
		
		String career;
		career = "Software Develper";
		
		System.out.println("My career" + career);
		
		int hoursPerWeek = 40;
		int weekPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weekPerYear * rate ;
		System.out.println("My salary as a " + career + "at a rate of" + rate + "per hour is $" + salary + " per year" );
		
	}

}
