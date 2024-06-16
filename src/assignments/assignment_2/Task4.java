package assignments.assignment_2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputs = new int[10];

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.println("Enter an integer:");
            } else {
                System.out.println("\nEnter another integer:");
            }

            int userInput = sc.nextInt();

            inputs[i] = userInput;
        }

        int sum = 0;
        int count = 0;
        int min = inputs[0];
        int max = inputs[0];

        for (int elem : inputs) {
            if (elem > 0 && elem % 2 == 1) {
                sum += elem;
                count++;

                if (elem < min) {
                    min = elem;
                }

                if (elem > max) {
                    max = elem;
                }
            }
        }

        if (count > 0) {
            float average = sum / (float) count;

            System.out.printf("\nSum = %d\n", sum);
            System.out.printf("Minimum = %d\n", min);
            System.out.printf("Maximum = %d\n", max);
            System.out.printf("Average = %.1f", average);
        } else {
            System.out.println("\nNo odd positive numbers found");
        }

        sc.close();
    }
}
