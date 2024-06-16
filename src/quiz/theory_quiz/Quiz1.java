package quiz.theory_quiz;

import java.util.Scanner;

/*
    Write a Java program that takes an integer n as user input and calculates a sum based on whether the numbers from 1 to n are odd or even. 
    For even numbers, the program adds the cube of the number to the sum. 
    For odd numbers, it adds the square of the number to the sum.
    The program should then print the calculated sum for every number from n down to 1.

    Example series (n = 3):
    For i = 1: 1^2 = 1
    For i = 2: 1^2 + 2^3 = 1 + 8 = 9
    For i = 3: 1^2 + 2^3 + 3^2 = 1 + 8 + 9 = 18

    Sample Input:
    3

    Sample Output:
    18
    9
    1
 */

class Calculate {
    public int formula(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += (int) Math.pow(i, 3);
            } else {
                sum += (int) Math.pow(i, 2);
            }
        }
        return sum;
    }
}

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println();
        sc.close();

        Calculate calc = new Calculate();

        for (int i = n; i >= 1; i--) {
            int result = calc.formula(i);
            System.out.println(result);
        }
    }
}
