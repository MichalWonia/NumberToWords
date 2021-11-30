public class NumberToWords {

    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int digits = number % 10;
            reverse = reverse + digits;
            reverse = reverse * 10;
            number = number / 10;
        }
        return reverse / 10;
    }

    public static int getDigitCount(int number) {
        return String.valueOf(number).length();
    }

    public static void main(String[] args) {

    }
}
