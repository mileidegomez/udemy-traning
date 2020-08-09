package basics;

public class Cities {
	public static void main (String[] args) {
		String[] cities = {"New  York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		String[] states = new String [5];
		
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		int i =0;
		do {
			System.out.println("States: " + states[i]);
			i++;
		}while (i<5);
		
		
		String[] countries = new String [3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		
		for (int count=0; count <4; count ++) {
			
			System.out.println("Countries: " + countries[count]);
		}
}
		
}
