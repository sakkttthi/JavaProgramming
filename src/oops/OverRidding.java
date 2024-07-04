package oops;

class Bank {
	 int rateOfIntrest() {
		return 10;
	}
}

class SBI extends Bank{
	int rateOfIntrest() {
		return 8;
	}
}

class HDFC extends Bank{
	int rateOfIntrest() {
		return 5;
	}
}

public class OverRidding {
	public static void main(String[] args) {
		Bank b1=new Bank();
		Bank b2=new SBI();
		Bank b3=new HDFC();
		System.out.println(b1.rateOfIntrest());
		System.out.println(b2.rateOfIntrest());
		System.out.println(b3.rateOfIntrest());
	}

}
