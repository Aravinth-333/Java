
import java.util.*;

public class day13 {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        while (Inp.hasNextLine()) {
            String str = Inp.nextLine();
            String[] st = str.split(" ");
            for (String s : st) {
                int length = s.length();
                char ch = (char) ('a' - (length - 1));
                System.out.println(ch);
            }
        }

    }
}
