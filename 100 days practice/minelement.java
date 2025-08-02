public class minelement {
    public static void main(String[] args) {
        int[] arr={1,4,3,-5,-4,8,6};
        int result=min(arr,arr.length);
        System.out.println(result);
    }
    static int min(int[] arr,int n){
        if(n==1) return arr[0];
        int minelement=min(arr,n-1);

        //it again start backtracking recursive ,divide and conquer
        if(arr[n-1]<minelement) return arr[n-1];
        else return minelement;
    }
}
