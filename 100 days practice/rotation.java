
import java.util.ArrayList;
import java.util.Scanner;

public class rotation {

    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = Inp.nextInt();
        System.out.println("Enter the rotation");
        int r = Inp.nextInt();
        System.out.println("Enter elements");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Inp.nextInt());
        }
        for (int i = 0; i < n / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(r + i));
            list.set(r + i, temp);
        }
        for (int elements : list) {
            System.out.print(elements + " ");
        }

    }

}
