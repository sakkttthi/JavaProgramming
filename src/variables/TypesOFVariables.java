package variables;

public class TypesOFVariables {
	int ist = 50; // instance variable
	static int stc = 50; // Static variable

	public static void main(String[] args) {
		int m = 10; // local variable
		System.out.println(ist); // instance variable cannot be called since it isnot static
		System.out.println(stc);
		System.out.println(m);

	}

}
