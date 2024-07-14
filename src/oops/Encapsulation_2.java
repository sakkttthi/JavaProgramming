package oops;

public class Encapsulation_2 {
	public static void main(String[] args) {
		Encapsulation_1 obj2=new Encapsulation_1();
		obj2.setAcc_ID(101);
		obj2.setAcc_name("Ram");
		obj2.setAcc_no(500);
		
		System.out.println(obj2.getAcc_ID());
		System.out.println(obj2.getAcc_name());
		System.out.println(obj2.getAcc_no());
	}

}
