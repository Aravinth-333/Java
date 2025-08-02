
import java.util.*;

public class day9 {

    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        String str = Inp.next();
        char[] ch = str.toCharArray();
        int n = ch.length;
        int length = n / 2;
        int i;
        for (i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length - 1 - i; j++) {
                System.out.print("*" + " ");
            }
            // for (int j = ch.length - 1 - i; j < ch.length; j++)
            for (int j = 0; j <= i; j++) {
                System.out.print(ch[(length + j) % n] + " ");
            }

            System.out.println(" ");
        }

    }
}
