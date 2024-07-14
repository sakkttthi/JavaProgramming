package oops;

abstract class Water{
	public void speak() {
		System.out.println("Speak method");
	}
	
	abstract void walk();
}

class Fire extends Water{

	void walk() {
		System.out.println("Walk method");
	}
	
}

public class Abstraction {
	public static void main(String[] args) {
		Water obj=new Fire();
		obj.walk();
		obj.speak();
	}

}
