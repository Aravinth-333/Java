
import java.util.*;

public class day7 {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        int n = Inp.nextInt();
        int count = 1;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            int num = count;
            for (int j = 0; j < n - i; j++) {
                System.out.print(num + " ");
                num += (n - j);
            }
            System.out.println(" ");
            count++;
        }

    }
}
