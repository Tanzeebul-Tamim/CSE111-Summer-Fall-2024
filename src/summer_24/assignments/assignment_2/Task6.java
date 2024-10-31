package summer_24.assignments.assignment_2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sumOfWX = 0;
        double sumOfW = 0;

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.println("Enter a decimal number and its corresponding weight separated by a space:");
            } else {
                System.out.println("\nEnter another decimal number and its corresponding weight separated by a space:");
            }

            double x = sc.nextDouble();
            double w = sc.nextDouble();
            double wx = w * x;

            sumOfWX += wx;
            sumOfW += w;
        }

        sc.close();

        double result = sumOfWX / sumOfW;

        System.out.printf("\nWeighted Average = %.15f", result);
    }
}