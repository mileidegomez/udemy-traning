package oop;

class Person{
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}
public class demo {
	public static void main (String[] args) {
		
		//Instantiating an object
		Person person1 = new Person();
		
		//Define some properties
		person1.name ="Joe";
		person1.email = "joe@email.com";
		person1.phone = "123456789";
		
		
		//Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();
		
		Person person2 = new Person();
		
		person2.name ="Maria";
		person2.email = "maria@email.com";
		person2.phone = "123456700";
		
		person2.walk();
		person2.sleep();
		person2.eat();
	}
	

}
