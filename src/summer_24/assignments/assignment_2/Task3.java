package summer_24.assignments.assignment_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int min = 0;
        int max = 0;
        boolean isFirstInput = true;

        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.println("Enter an integer:");
            } else {
                System.out.println("\nEnter another integer:");
            }

            int userInput = sc.nextInt();
            sum += userInput;

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

        float average = sum / 10f;

        System.out.printf("\nSum = %d\n", sum);
        System.out.printf("Minimum = %d\n", min);
        System.out.printf("Maximum = %d\n", max);
        System.out.printf("Average = %.1f", average);

        sc.close();
    }
}