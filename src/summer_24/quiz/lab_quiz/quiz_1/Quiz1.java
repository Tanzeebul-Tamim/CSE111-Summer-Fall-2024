package summer_24.quiz.lab_quiz.quiz_1;

/*
    Write a java program that asks the user to input deposit amount and time period (in years). The chart below shows the interest rate according to the deposit. Calculate the simple interest using the formula: interest = (Deposit * Rate * Time) / 100. Finally display the total receivable amount after that amount of year.

    Interest Rate according to Deposited Amount:
    Less Than 10000 BDT - No Interest
    Greater or equal 10000 and less than 50000 BDT - 8%
    Greater or equal 50000 and less than 100000 BDT Greater than 100000 BDT - 10%
    Greater than 100000 BDT - 12%

    Output Format:
    "Total Receivable after [Time] years: [total amount]"
    
    Sample Input 1:
    5000.0
    5

    Sample Output 1:
    Interest: 0.0
    Total Receivable after 5 years: 5000.0

    Explanation 1:
    Since the amount is less than 10,000 that's why no interest.


    Sample Input 2:
    35000.0
    3

    Sample Output 2:
    Interest: 8400.0
    Total Receivable after 3 years: 43400.0

    Explanation 2:
    8% of 35000 is 8400.0 So total amount 35000+8400-43400.
 */

import java.util.Scanner;

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
        } else if (deposit >= 10000 && deposit < 50000) {
            rate = 8;
        } else if (deposit >= 50000 && deposit < 100000) {
            rate = 10;
        } else {
            rate = 12;
        }

        sc.close();

        float interest = (deposit * rate * time) / 100;

        System.out.format("\nInterest: %.1f", interest);
        System.out.format("\nTotal Receivable after %d years: %.1f", time, interest + deposit);
    }
}
