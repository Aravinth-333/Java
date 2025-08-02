
class Solution {

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninety"};

        return convert(num, ones, tens).trim();
    }

    private String convert(int num, String[] ones, String[] tens) {
        StringBuilder sb = new StringBuilder();

        if (num >= 1_000_000_000) {
            sb.append(convert(num / 1_000_000_000, ones, tens)).append(" Billion ");
            num %= 1_000_000_000;
        }
        if (num >= 1_000_000) {
            sb.append(convert(num / 1_000_000, ones, tens)).append(" Million ");
            num %= 1_000_000;
        }
        if (num >= 1000) {
            sb.append(convert(num / 1000, ones, tens)).append(" Thousand ");
            num %= 1000;
        }
        if (num >= 100) {
            sb.append(convert(num / 100, ones, tens)).append(" Hundred ");
            num %= 100;
        }
        if (num >= 20) {
            sb.append(tens[num / 10]).append(" ");
            num %= 10;
        }
        if (num > 0) {
            sb.append(ones[num]).append(" ");
        }

        return sb.toString();
    }
}
