
import java.util.*;

public class print1_n {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        int count = 0;
        int n = Inp.nextInt();
        for (int i = 1; i <= n; i++) {
            //valueof method is used to get the number with the help of string we can convert them into string
            //step1
            // int a = String.valueOf(i).length();
            // count += a;
            // step2
            count += String.valueOf(i).length();
        }
        System.out.println(count);

    }
}
