public class sumdigittail {
    public static void main(String[] args) {
        int arr[]={1,8,9};
        int result=sumofdigit(arr,0,0);
        System.out.println(result);

    }
    static int sumofdigit(int[] arr,int length,int sum){
        if(arr.length==length) return sum;
        return sumofdigit(arr,length+1,sum+=arr[length]);
        //first it will run with sumofdigits(arr,0,0) then it will increment the length it is like post increment
    }
}
