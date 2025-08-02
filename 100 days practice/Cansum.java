import java.util.Scanner;

public class Cansum {
    public static void main(String[] args) {
        Scanner Inp=new Scanner(System.in);
        System.out.println("Enter the target");
        int target=Inp.nextInt();
        System.out.println("Enter the rows");
        int n=Inp.nextInt();
        System.out.println("Enter the array elements.");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Inp.nextInt();
        }
        //dp array with the target+1
        boolean[] dp=new boolean[target+1]; dp[0]=true;//base case
        for(int i=0;i<=target;i++){
            for(int j=0;j<n;j++){
                int targetsum=i+arr[j];
                if(targetsum<=target && dp[i]) dp[targetsum]=true;
            }
        }
        System.out.println(dp[target]?"Yes":"No");
        for(int i=0;i<dp.length-1;i++){
            if(i+(i+1)==target && dp[i] && dp[i+1]){
                System.out.println(i+" "+i+1);
            }
        }
  }
}
