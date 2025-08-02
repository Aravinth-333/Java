package Recursion;

public class First {
	public static void main(String args[]) {
		
		Hello();

	}

	private static void Hello() {
		System.out.println("Hello!Aravinth");
		Hello();
		Sum();
//		Hello();
	}
	static void Sum() {
		System.out.println("5");
	}

}
