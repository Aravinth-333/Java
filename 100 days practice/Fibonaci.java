package Recursion;
public class Fibonaci {

	public static void main(String[] args) {
		
		//recursive
		int result=nthfibonaci(50);
		System.out.println(result);
		
		//tailrecursive
//		int result=tailrecursive(0,1,5);
//		System.out.println(result);
		
		

	}
	
	//recursive
	static int nthfibonaci(int n) {
		if(n<=1) // enters into it when 0 and 1 
			return n; //for 0 and 1 the value is 0 and 1
		return nthfibonaci(n-1)+nthfibonaci(n-2);//to calculate the fibonaci we need the previous index element and one more previous index element
	}
	
	//TailRecursive
//	static int tailrecursive(int a,int b,int n) {
//		if(n==0)
//			return a;
//		else
//			return tailrecursive(b,a+b,n-1);
//		//in place of a we use b because it is logic we need to swap and need to add two numbers
//	}
	

}
