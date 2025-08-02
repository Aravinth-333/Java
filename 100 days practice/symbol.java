
import java.util.*;

public class symbol {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        String str = Inp.next();
        System.out.println("Enter the name:");
        String Name = Inp.next();
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            System.out.print(str.charAt(i));
        }
        for (int i = n / 2; i < n; i++) {
            System.out.print(str.charAt(i));
        }

    }
}
