package variables;

public class Typecasting {
	public static void main(String[] args) {
//		Widening
		int a = 10;
		float b = a;
		System.out.println(a); // 10
		System.out.println(b); // 10.0 adds decimals since type casted to float

//		Narrowing
		float num = 10.55f;
		int single = (int) num;
		System.out.println(num); // 10.55
		System.out.println(single); // 10 narrowed the decimals

	}
}
