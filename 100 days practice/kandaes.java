
import java.util.*;
// public class kandaes {
//     public static void main(String args[]){
//         Scanner Inp=new Scanner(System.in);
//         System.out.println("Enter the size");
//         int n=Inp.nextInt();
//         int arr[]=new int[n];
//         System.out.println("Enter the array elements:");
//         for(int i=0;i<n;i++){
//             arr[i]=Inp.nextInt();
//         }
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[j];
//                 max=Math.max(max,sum);
//                 System.out.println("Max"+max);
//             }
//         }
//         // System.out.println(max);
//     }
// }

public class kandaes {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = Inp.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = Inp.nextInt();
        }
        int sum = 0;
        int max = arr[0];
        // for (int i = 0; i < n; i++) {
        //     sum += arr[i];
        //     max = Math.max(sum, max);
        //     if (sum < 0) {
        //         sum = 0;
        //     }
        //     System.out.println("Max" + max);
        // }
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
                System.out.println("Inner loop " + sum + " " + "max " + max);
            }
            System.out.println("");
            System.out.println("sum: " + sum + " " + "max: " + max);
        }
    }
}
