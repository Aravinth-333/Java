
import java.util.*;

public class day3 {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        int n = Inp.nextInt();
        String sol = " ";
        while (n > 0) {
            int remainder = (n - 1) % 26;
            int quiotent = (n - 1) / 26;
            sol = (char) ('A' + remainder) + sol;
            n = quiotent;
        }
        System.err.println(sol);

    }
}
