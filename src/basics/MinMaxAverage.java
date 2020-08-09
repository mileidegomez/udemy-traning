package basics;

public class MinMaxAverage {
	public static void main (String[] args) {
		int[] array = {11,12,13,14};
		System.out.println(maxi(array));
		System.out.println(min(array));
		System.out.println(Avg(array));

	        

	}
		
	public static int maxi(int[] MaxNum) {
		MaxNum = new int[4];
		int max = 0;
		for (int i = 0; i<= 3 ; i++) {
			if ((MaxNum[i] > max)) {
				max = MaxNum[i];
			}
		}
		return max;
		
	}
	
	public static int min(int[] MinNum) {
		MinNum = new int[4];
		int minn = 0;
		for (int i = 0; i<= 3 ; i++) {
			if ((MinNum[i] > minn)) {
				minn = MinNum[i];
			}
		}
		return minn;
		
	}
	
	
	public static double Avg(int[] AvgNum) {
		AvgNum = new int[4];
		double avg = 0;
		int total = 0; 
		for (int i = 0; i<= 3 ; i++) {
			total = total + AvgNum[i];
		}
		avg = total/3; 
		return avg;
		
	}
	

}
