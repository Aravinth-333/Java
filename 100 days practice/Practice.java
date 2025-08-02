
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// import java.util.*;
// public class Practice {
//     public static void main(String args[]) {
//         Scanner Inp = new Scanner(System.in);
//         String str = Inp.next();
//         String strresult = str.replaceAll(" ", "");
//         //string length
//         int len = strresult.length();
//         //caluting rows and columns
//         int square_root = (int) Math.sqrt(len);
//         int sq_root_res = square_root + 1;
//         char[][] resulant_array = new char[square_root][sq_root_res];
//         int index = 0;
//         for (int i = 0; i < square_root; i++) {
//             for (int j = 0; j < sq_root_res; j++) {
//                 resulant_array[i][j] = strresult.charAt(index);
//                 index++;
//             }
//         }
//         for (int j = 0; j < sq_root_res; j++) {
//             for (int i = 0; i < square_root; i++) {
//                 System.out.print(resulant_array[i][j]);
//             }
//             System.out.print(" ");
//         }
//     }
// }
public class Practice {

    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = Inp.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(Inp.nextInt());
        }
        // System.out.print("List before Deleted " + list);
        // int min = 2;
        // list.removeIf(num -> num == min);
        // System.out.print("List after deleted " + list);

        while (!list.isEmpty()) {
            int min_value = Collections.min(list);
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (min_value == list.get(i)) {
                    count++;
                }
            }
            System.out.println(count);
            list.removeIf(num -> num == min_value);
        }

    }
}
