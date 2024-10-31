package summer_24.assignments.assignment_2;

import java.util.Scanner;

public class Task8 {
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= (int) num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void countPrimes(int num1, int num2) {
        int count = 0;

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        if (count == 0) {
            System.out.format("\nThere aren't any prime numbers between %d and %d.", num1, num2);
        } else if (count == 1) {
            System.out.format("\nThere is only one prime number between %d and %d.", count, num1, num2);
        } else {
            System.out.format("\nThere are %d prime numbers between %d and %d.", count, num1, num2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int num1 = sc.nextInt();

        System.out.println("\nEnter another integer:");
        int num2 = sc.nextInt();

        sc.close();

        countPrimes(num1, num2);
    }
}