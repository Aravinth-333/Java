import java.util.ArrayList;
import java.util.List;

public class nfibonaci {
    public static void main(String[] args) {
        int n=3;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(fib(i));
        }
        System.out.println(list);

    }
    static int fib(int n){
        if(n<=1) return n;
        return fib(n-1)+fib(n-2);
    }
}
