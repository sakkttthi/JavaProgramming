package controlstatements;

public class JumpStatement {
	public static void main(String[] args) {
//		Break statement
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==5) {
				break;
			}
		}
		
//		Skip
		for (int i = 0; i < 10; i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}
		
	}

}
