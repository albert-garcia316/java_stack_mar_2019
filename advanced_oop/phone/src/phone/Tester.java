package phone;

public class Tester {

	public static void main(String[] args) {
		Galaxy S9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		IPhone iphone = new IPhone("X", 100, "ATT%T", "Zing");
		
		S9.displayInfo();
		System.out.println(S9.ring());
		System.out.println(S9.unlock());
		iphone.displayInfo();
		System.out.println(iphone.ring());
		System.out.println(iphone.unlock());
		
	}

}
