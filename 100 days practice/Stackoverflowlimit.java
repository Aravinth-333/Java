package Recursion;

public class Stackoverflowlimit {

	public static void main(String[] args) {
		limit(1);
		

	}
	static void limit(int count) {
		System.out.println(count);
		limit(count+1);
	}

}
