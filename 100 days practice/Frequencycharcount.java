
import java.util.Scanner;

public class Frequencycharcount {

    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = Inp.nextLine();
        int freq[] = new int[26];
        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            freq[ch[i] - 'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.print((char) (i + 'a') + "" + freq[i]);
            }
        }
    }
}
