
import java.util.Scanner;

public class Numbertoword {

    public static void main(String[] args) {
        Scanner Inp = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = Inp.nextInt();
        String ones[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "tweleve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "ninteen"};
        String tens[] = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninty"};
        StringBuilder sb = new StringBuilder();
        if (number >= 1000) {
            sb.append(ones[number / 1000]).append(" Thousand ");
            number %= 1000;
        }
        if (number >= 100) {
            sb.append(ones[number / 100] + " ").append("Hundred");
            number = number % 100;
            if (number != 0) {
                sb.append(" and ");
            }
        }
        if (number >= 20) {
            sb.append(tens[number / 10] + " ");
            number = number % 10;
        }
        if (number > 0) {
            sb.append(ones[number]);
        }
        System.out.println(sb);
    }
}
