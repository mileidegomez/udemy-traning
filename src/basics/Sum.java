package basics;

public class Sum {
	public static void main(String[] args) {
		
		System.out.println(soma(10));
	}

	static int soma(int num) {
		int sum = 0;
		for (int i=1; i <=num; i++) {
			sum+=i;
		}
		return sum;
	}
}
