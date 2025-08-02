//Method-1
// import java.util.*;

// public class string_number {
//     public static void main(String args[]) {
//         Scanner Inp = new Scanner(System.in);
//         String str = Inp.next();
//         StringBuilder number = new StringBuilder();
//         StringBuilder alphabets = new StringBuilder();
//         for (char ch : str.toCharArray()) {
//             if (Character.isDigit(ch)) {
//                 number.append(ch);
//                 // Character.isAlphabetic(ch)
//                 // alphabets.append(ch);
//             } else {
//                 alphabets.append(ch);
//                 // number.append(ch);
//             }
//         }
//         System.out.println("Numbers_only " + number);
//         System.out.print("Alphabets_only " + alphabets);
//     }
// }
import java.util.*;

public class string_number {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        String str = Inp.next();
        StringBuilder number = new StringBuilder();
        StringBuilder Alphabets = new StringBuilder();

        number.append(str.replaceAll("[0-9]", "*"));
        Alphabets.append(str.replaceAll("[^0-9]", ""));

        System.out.println(number);
        System.out.println(Alphabets);
    }
}
