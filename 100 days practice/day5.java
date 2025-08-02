
import java.util.*;

public class day5 {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        int n = Inp.nextInt();
        int result = 0;
        int count = 0;
        char[] ch;
        for (int i = 1; i <= n; i++) {
            result = i;
            ch = Integer.toString(result).toCharArray();
            count += ch.length;
        }
        System.out.println(count);
        // for(int i=0;i<ch.length;i++){
        //     System.out.println(ch[i]);
        // }
    }
}
