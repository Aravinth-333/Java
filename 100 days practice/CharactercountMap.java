
import java.util.*;

public class CharactercountMap {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.println("Enter a String");
        String str = Inp.nextLine();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            map.put(ch[i], map.getOrDefault(ch[i], 0) + 1);
        }
        // for (char ch1 : map.keySet()) {
        //     System.out.print(ch1 + "" + map.get(ch1));
        // }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "" + entry.getValue());
        }
    }
}
