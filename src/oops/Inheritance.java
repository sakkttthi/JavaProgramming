package oops;

class Animal {
	public void Sound() {
		System.out.println("Sound of Animals");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Dog barks");
	}
}

class BabyDog extends Dog{
	public void eat() {
		System.out.println("Baby dog eats biscut");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		BabyDog obj=new BabyDog();
		obj.bark();
		obj.Sound();
		obj.eat();
	}

}
