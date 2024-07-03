package oops;

class Car {
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
}

public class Overloading {
	public static void main(String[] args) {
		Car obj=new Car();
		System.out.println(obj.add(10, 50));
		System.out.println(obj.add(50.5, 20.1));
	}

}
