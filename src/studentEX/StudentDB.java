package studentEX;

public class StudentDB {
	public static void main (String[] args) {
		
		Student obj = new Student("Mileide", "001234");
		
		obj.setPhone(932153419);
		System.out.println("[Your phone number: " + obj.getPhone() + "]");
		
		obj.setCity("Lisbon");
		System.out.println("[Your city: " + obj.getCity() + "]");
		
		obj.setState("Almada");
		System.out.println("[Your state: " + obj.getState() + "]");
		
		obj.enroll(120);
		obj.checkBalance();
		obj.toString();
		obj.showCourses();
		
	}

}

class Student{
	
	private static int id;
	private String name;
	private String ssn;
	private String emailID;
	private int phone;
	private String city;
	private String state;
	private double balance;
	
	Student(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
		int num;
		num = (int) (1000 + Math.random() * 9000  );
		
		String userid;
		userid = id + num + ssn.substring(0,4); 
		
		emailID = name + "@shcool.com"; 
		System.out.println("[Student name: " + name + "]\n [Student email: " + emailID + "]\n [Your User Id: " + userid + "]" );
	}
	
	public void enroll(double balance) {
		System.out.println("You enrolled");
		
	}
	
	public void pay(double payment) {
		System.out.println("[You made a payment of: " + payment + "dollars]");
		balance -= payment;
	}
	
	public void checkBalance(){
		System.out.println("[Your balance is: " + balance + "]");
	}
	
	public String toString() {
		return "[Name: "+ name + " ]\n [Balance: " + balance + "]" ;
		
	}
	
	public void showCourses() {
		System.out.println("-----------------Courses----------------\n");
		System.out.println("[ Computer Science ] \n [ Civil Engineering ] \n [ Medicine ] \n [ Quimical Engineering ] \n [ Aerospace Engineering ] \n [ Biomedical Engineering ]");
	}
	
	public void setPhone(int phone) {
		this.phone = phone;
		
	}

	public int getPhone() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;
		
	}

	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
		
	}

	public String getState() {
		return state;
	}
	
	
}