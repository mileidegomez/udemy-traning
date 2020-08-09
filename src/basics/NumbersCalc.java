package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("The program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println(multipleNumbers(numA,numB));
	}
	
	static void printName() {
		System.out.println("My name is Mileide");
	};
	
	static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of the numbers " + numberA + " and " + numberB + " is: " + sum);
	};
	
	static int multipleNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		return product;
	};

}
