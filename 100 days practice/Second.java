//Number of times we need to print the value
package Recursion;

public class Second {

	public static void main(String[] args) {
		Print(10000);//It will return
//		Print(88888); // It will never run throws stack overflow error
		

	}
	static void Print(int count) {
		System.out.println("Hello");
		if(count<=1)
			return;
			else
				Print(count-1);
				
	}

}
