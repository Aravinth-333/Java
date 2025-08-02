public class factorial {
    public static void main(String[] args) {
        int fact=0;
        int result=factorial(fact);
        System.out.println(result);
    }
    static int factorial(int n){
        if(n<=1) return 1;
        return n*factorial(n-1);
    }
}
