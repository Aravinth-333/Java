
import java.util.*;

public class day8 {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        int n = Inp.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = Inp.nextInt();
        }
        for (i = 0; i < n; i++) {
            boolean isgreater = true;
            for (int j = 0; j < i; j++) {
                if (arr[i] <= arr[j]) {
                    isgreater = false;
                    break;
                }
            }
            if (isgreater) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
