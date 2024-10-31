package summer_24.assignments.assignment_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int zeroCounter = 0;
        int count = 0;
        int min = 0;
        int max = 0;
        boolean isFirstInput = true;

        for (int i = 0; true; i++) {
            if (i == 0) {
                System.out.println("Enter an integer:");
            } else {
                System.out.println("\nEnter another integer:");
            }

            int userInput = sc.nextInt();

            if (userInput == 0) {
                zeroCounter++;
            } else {
                zeroCounter = 0;
                sum += userInput;
                count++;

                if (isFirstInput) {
                    min = userInput;
                    max = userInput;
                    isFirstInput = false;
                } else {
                    if (userInput < min) {
                        min = userInput;
                    }

                    if (userInput > max) {
                        max = userInput;
                    }
                }
            }

            if (zeroCounter == 3) {
                break;
            }
        }

        if (count > 0) {
            double average = sum / (double) count;

            System.out.printf("\nSum = %d\n", sum);
            System.out.printf("Minimum = %d\n", min);
            System.out.printf("Maximum = %d\n", max);
            System.out.printf("Average = %.15f", average);
        } else {
            System.out.println("\nNo numbers found");
        }

        sc.close();
    }
}