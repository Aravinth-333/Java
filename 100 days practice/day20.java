
import java.util.*;

public class day20 {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        int n = Inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Inp.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(arr[i] + Math.abs(0 - arr[i + 1]) + " ");
            } else if (i == n - 1) {
                System.out.print(arr[i] + Math.abs(arr[i - 1] - 0));
            } else {
                int ab = Math.abs(arr[i - 1] - arr[i + 1]);
                System.out.print((ab + arr[i]) + " ");
            }
        }
    }
}
