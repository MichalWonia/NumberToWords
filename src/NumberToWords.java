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

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Minus");
            number = -number;
        }

        int numberLength = getDigitCount(number);
        int reversedNumber = reverseNumber(number);

        for (int j = 0; j < numberLength; j++) {

            int digits = reversedNumber % 10;

            if (digits == 0) {
                System.out.println("Zero");
            }
            if (digits == 1) {
                System.out.println("One");
            }
            if (digits == 2) {
                System.out.println("Two");
            }
            if (digits == 3) {
                System.out.println("Three");
            }
            if (digits == 4) {
                System.out.println("Four");
            }
            if (digits == 5) {
                System.out.println("Five");
            }
            if (digits == 6) {
                System.out.println("Six");
            }
            if (digits == 7) {
                System.out.println("Seven");
            }
            if (digits == 8) {
                System.out.println("Eight");
            }
            if (digits == 9) {
                System.out.println("Nine");
            }
            reversedNumber = reversedNumber / 10;
        }
    }

    public static void main(String[] args) {
        numberToWords(-1680);
    }
}
