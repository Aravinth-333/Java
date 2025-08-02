package Recursion;

public class Third {

	public static void main(String[] args) {
		NumbertoN(1,5);

	}
	static void NumbertoN(int count,int Number) {
		System.out.println(count);
		if(count==Number)
			return;
		else
			NumbertoN(count+1,Number);
	}

}
