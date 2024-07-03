package controlstatements;

public class DecisionMaking {
	public static void main(String[] args) {
//		If-Else statement
		String str = "Ooty";
		if (str.equalsIgnoreCase("Karur")) {
			System.out.println("You have reached Karur");
		} else if (str.equalsIgnoreCase("ooty")) {
			System.out.println("You have reached Ooty");
		} else {
			System.out.println("Please enter correct city");
		}

//		Switch
		switch (str) {
		case "Karur":
			System.out.println("You have reached Karur");
			break;
		case "Ooty":
			System.out.println("You have reached Ooty");
			break;
		default:
			System.out.println("Please enter correct city");
			break;
		}
	}
}
