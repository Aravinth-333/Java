
import java.util.Scanner;

public class Charactercount {

    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = Inp.nextLine();
        char[] ch = str.toCharArray();
        int count = 1;
        char ch1 = ch[0];
        for (int i = 1; i < ch.length; i++) {
            if (ch1 == ch[i]) {
                count++;
            } else {
                System.out.print(ch1 + "" + count);
                ch1 = ch[i];
                count = 1;
            }
        }
        System.out.print(ch1 + "" + count);
    }
}
