package exceptionsfiles;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		doMath(12,0);
		System.out.println("Program Continues");

	}
	
	public static void doMath (int a, int b) {
		/*int c = a/b;
		System.out.println(c); */
		answer(a,b);
	}
	
	public static double answer (int x, int y ) {
		return x/y;
	}

}
