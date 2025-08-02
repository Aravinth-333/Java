public class sumdigit {
    public static void main(String[] args) {
        int arr[]={2,55,1,7};
        int result=sumofdigit(arr,0);
        System.out.println(result);
    }
    static int sumofdigit(int[] arr,int length){
        if(length==arr.length) return 0;
        return arr[length]+sumofdigit(arr,length+1);

    }
}
