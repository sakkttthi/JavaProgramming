package oops;

interface printable{
	void print();
}

class write implements printable{

	public void print() {
		System.out.println("Printing");
		
	}
	
}

public class Interface {
	public static void main(String[] args) {
		write obj1=new write();
		obj1.print();
	}

}
