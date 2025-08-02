public class maxelement {
    public static void main(String[] args) {
        int[] arr={1,4,3,-5,-4,8,6};
        int result=max(arr,arr.length);
        System.out.println(result);
    }
    static int max(int[] arr,int n){
        //base case
        if(n==1) return arr[0];

        int maxelement=max(arr,n-1);
        //finds till index 1 and start the if and else block and backtrack the each step in the call stack

        if(arr[n-1]>maxelement) return arr[n-1];
        else return maxelement;
    }
}
