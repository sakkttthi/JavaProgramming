package basics;

public class Operators {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

//		Unary operator
		System.out.println("Unary operator");
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(b--);
		System.out.println(--b);

//		Arithmatic operators
		System.out.println("Arithmatic operators");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

//		Logical && Bitwise & operator 

		/*
		 * The logical && operator doesn't check the second condition if the first
		 * condition is false. It checks the second condition only if the first one is
		 * true. The bitwise & operator always checks both conditions whether first
		 * condition is true or false. bitwise & operator always checks both conditions
		 * whether first condition is true or false.
		 */

		System.out.println("Logical && Bitwise & operator ");
		System.out.println(a > b && a++ < b);
		System.out.println(a);
		System.out.println(a > b & a++ < b);
		System.out.println(a);

//		Ternary Operator
		System.out.println("Ternary Operator");
		int max = (a > b) ? a : b;
		System.out.println(max);
		
//		Assignment Operator
		System.out.println("Assignment Operator");
		a+=100;
		System.out.println(a);
		a-=50;
		System.out.println(a);
		a*=10;
		System.out.println(a);
		a/=2;
		System.out.println(a);
		
	}

}
