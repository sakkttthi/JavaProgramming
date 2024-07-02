package controlstatements;

public class Loops {
	public static void main(String[] args) {
//		for loop
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
//		for each loop
		String str[]= {"bmw","volvo","benz"};
		for (String string : str) {
			System.out.println(string);
		}
		
//		while loop
		int a = 5;
		while (a<10) {
			System.out.println(a);
			a++;
		}
		
//		do while loop
		int b=10;
		do {
			System.out.println(b);
			b++;
		} while (b<15);
	}

}
