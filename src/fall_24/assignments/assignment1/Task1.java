package fall_24.assignments.assignment1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, min = 0, max = 0, count = 0;

        for (int i = 1; i <= 10; i++) {
            String suffix = i == 1 ? "st" : i == 2 ? "nd" : i == 3 ? "rd" : "th";

            System.out.format("Enter the %d%s element:\n", i, suffix);
            int elem = sc.nextInt();
            System.out.println();

            if (elem % 2 != 0 && elem >= 0) {
                count++;

                if (i == 1) {
                    sum = elem;
                    min = elem;
                    max = elem;
                } else {
                    sum += elem;

                    if (elem < min) {
                        min = elem;
                    }
                    if (elem > max) {
                        max = elem;
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println("No odd positive number found.");
        } else {
            double avg = (double) sum / count;

            System.out.format("Sum = %d\n", sum);
            System.out.format("Minimum = %d\n", min);
            System.out.format("Maximum = %d\n", max);
            System.out.format("Average = %.1f\n", avg);
        }

        sc.close();
    }
}
