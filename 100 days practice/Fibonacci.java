import java.util.Scanner;
//Tabulation approach
public class Fibonacci {
    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        //Create a array with the size n+1 beacuse we need to store the value of zero
        System.out.println("Enter number: ");
        int size= Inp.nextInt();
        int[] dp=new int[size+1];//table
        //Intial value
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=size;i++){
            dp[i]=dp[i-1]+dp[i-2];//tabulation where it will caluculte and store the value
//            System.out.println(dp[i]);
        }
        //to print the n value we not need to use loop
        System.out.println("Output:"+dp[size]);
    }
}
