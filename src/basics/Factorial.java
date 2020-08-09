package basics;

public class Factorial {
	public static void main(String[] args) {
		
		System.out.println(fac(5));
		
	}
	
	static int fac(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		else {
			return num * fac(num-1);
		}

	}

}
