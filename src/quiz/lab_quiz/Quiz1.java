package quiz.lab_quiz;

import java.util.Scanner;

/*
    Write a Java program which takes the deposit amount and time period (in years) as user input, and calculates the interest and total receivable amount using the formula (deposit * rate * time) / 100. Calculate the interest and total amount.

    Sample Input:
    75000
    5

    Sample Output:
    Interest: 37500.00
    The total receivable amount after 5 years is: 112500.00
 */

public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a deposit amount:");
        float deposit = sc.nextFloat();

        System.out.println("\nEnter time period (in years):");
        int time = sc.nextInt();

        int rate;
        if (deposit < 10000) {
            rate = 0;
        } else if (deposit >= 1000 && deposit < 50000) {
            rate = 8;
        } else if (deposit >= 50000 && deposit < 100000) {
            rate = 10;
        } else {
            rate = 12;
        }

        sc.close();

        float interest = (deposit * rate * time) / 100;

        System.out.format("\nInterest: %.2f", interest);
        System.out.format("\nThe total receivable amount after %d years is: %.2f", time, interest + deposit);
    }
}
