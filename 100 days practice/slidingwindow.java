import java.util.*;
public class slidingwindow {
    public static void main(String args[]){
        Scanner Inp=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=Inp.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=Inp.nextInt();
        }
        System.out.println("Enter window size");
        int k=Inp.nextInt();
    //     int sum=0;
    //     int max=Integer.MIN_VALUE;
    //     if(arr.length<k) System.out.println("Invalid");
    //     else{
    //     for(int i=0;i<n-k+1;i++){
    //         sum=0;
    //         for(int j=0;j<k;j++){
    //             sum+=arr[i+j];
    //             max=Math.max(sum,max);
    //         }
    //     }
    //     System.out.println("maxvalue "+max);
    // }

    //using sliding window

    int intial_sum=0;
    int max=Integer.MIN_VALUE;
    if(arr.length<k){
        System.out.println("Invalid");
        return;
    }
    for(int i=0;i<k;i++){
        intial_sum+=arr[i];//it runs only once and moved into j loop so to calculate intial sum one more time we used to assign a value to window sum
        System.out.println("Intial sum: "+intial_sum);
    }//if we use window sum we need to use this after j loop
        // int window_sum=intial_sum;
        for(int j=k;j<n;j++){
            intial_sum=intial_sum+arr[j]-arr[j-k];
            max=Math.max(intial_sum,max);
            System.out.println("Inner loop "+max);
        }
    // }
    System.out.println(max);
    }
}
