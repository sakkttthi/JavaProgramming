package oops;

abstract class Shape {
	abstract void run();
}

class Rectangle extends Shape {
	void run() {
		System.out.println("Draw Rectancgle");
	}
}

class Circle extends Shape {
	void run() {
		System.out.println("Draw Circle");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Shape s=new Circle();
		s.run();

	}
}
