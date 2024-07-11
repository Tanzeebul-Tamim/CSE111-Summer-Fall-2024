package practice_or_rough_works;

/*
    You need to write a Java program to encrypt a given number by multiplying each digit by 3 and outputting the results. The program will have two encryption methods: one that processes the digits in reverse order and another that processes the digits in the original order. The program will take an integer input and print the encrypted result for both methods.

    Sample Input 1:
    91526


    Sample Output 1:
    Encrypted in original order: 27 3 15 6 18 
    Encrypted in reverse order: 18 6 15 3 27 


    Explanation 1:
    In the given sample input, the number is 91526.

    For the reverse order encryption, the digits are processed from right to left (6, 2, 5, 1, 9), and each digit is multiplied by 3, resulting in 18, 6, 15, 3, 27.

    For the original order encryption, the digits are processed from left to right (9, 1, 5, 2, 6), and each digit is multiplied by 3, resulting in 27, 3, 15, 6, 18.
 */

public class NumberEncrypting {
    static void encryptReverse(int number) {
        System.out.print("Encrypted in reverse order: ");

        for (; number > 0; number /= 10) {
            int currentDigit = number % 10;
            int output = currentDigit * 3;
            System.out.print(output + " ");
        }
        System.out.println();
    }

    static void encrypt(int number) {
        System.out.print("Encrypted in original order: ");
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

        encrypt(number);
        encryptReverse(number);
    }
}
