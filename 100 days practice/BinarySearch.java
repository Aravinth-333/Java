package Recursion;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,55,66,78};
		int target=66;
		int result=Bst(arr,target,0,arr.length-1);
		System.out.println(result);
		
		

	}
	static int Bst(int[] arr,int target,int left,int right) {
		//here left ,right is needed for further operation so we declared inside the function because left and right will change for further operation
		
		int mid=(left+right)/2;//here mid is requried to calculate in each before start processing so we declared here it will change only once untill the specific function ends
		
		if(left>right) return -1;//base case where the element not found
		
		if(arr[mid]==target)
			return mid;
		if(arr[mid]<target)
			
//			left=mid+1;//the element is present in the right hand side this is for mormal this can written as recursive that is
		 return Bst(arr,target,mid+1,right);//what we say is arr,target,right we never change we else the value of left will be change based on normal case
		
		if(arr[mid]>target)
			right=mid-1;//the element is present in left hand side so that we need to move right equal to mid-1 it can written as recursive call
		 return Bst(arr,target,left,mid-1);
		
		
		
	}

}
