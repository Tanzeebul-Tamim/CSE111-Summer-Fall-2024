package lab_quiz;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a deposit amount:");
        float deposit = sc.nextFloat();

        System.out.println("Enter time period (in years):");
        int time = sc.nextInt();

        int rate;
        if (deposit < 10000)  {
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

        System.out.format("Interest: %.2f", interest);
        System.out.format("\nThe total receivable amount after %d years is: %.2f", time, interest + deposit);
    }
}
