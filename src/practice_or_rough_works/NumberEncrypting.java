package practice_or_rough_works;

// Encrypting a number by multiplying each digit by 3 in reverse

public class NumberEncrypting {
    static void encryptReverse(int number) {
        for (; number > 0; number /= 10) {
            int currentDigit = number % 10;
            int output = currentDigit * 3;
            System.out.print(output + " ");
        }
        System.out.println();
    }

    static void encrypt(int number) {
        // Find the number of digits in the number
        int lenStr = String.valueOf(number).length();
        // Find the highest divisor
        int divisor = (int) Math.pow(10, lenStr - 1);

        // Loop to process each digit from left to right
        for (; divisor >= 1; divisor /= 10) {
            int currentDigit = number / divisor;
            int output = currentDigit * 3;
            System.out.print(output + " ");
            number %= divisor; // Remove the processed digit
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number = 91526;

        encryptReverse(number);
        encrypt(number);
    }
}
