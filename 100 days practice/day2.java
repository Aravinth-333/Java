import java.util.Scanner;

class Result {
    public static int Solution(int[] arr, int threshold) {
        int i;
        int count = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] % threshold != 0) {
                int remainder = arr[i] / threshold + 1;
                count += remainder;
            } else {
                int remainder = arr[i] / threshold;
                count += remainder;
            }
        }
        return count;

    }
}

public class day2 {

    public static void main(String args[]) {
        Scanner Inp = new Scanner(System.in);
        int n = Inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Inp.nextInt();
        }
        int threshold = Inp.nextInt();

        int solution = Result.Solution(arr, threshold);
        System.out.println(solution);

    }
}