package basics;

public class Weather {
	public static void main(String[] args) {
	
	int temperature = 65;
	String SunCondition = "OverCast";
	
	if (temperature > 80) {
		System.out.println("It's pleasant. Wear shorts and t-shirt");
	}
	else if ((temperature > 60) && (SunCondition == "Sunny") ) {
		System.out.println("It's a little cooler. Perhaps wear a long-sleeve shirt and jeans.");
		System.out.println("Wear a hat to keep the sun out of your eyes.");
	}
	else if ((temperature > 50) || (SunCondition == "Overcast")) {
		System.out.println("This is a cool day. Make sure to wear warm clothes.");
	}
	else {
		System.out.println("Looks like a cold day. Bring a sweater.");
	}
		
	System.out.println("The program is ending.");
	}

}
