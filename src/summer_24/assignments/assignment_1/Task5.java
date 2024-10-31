package summer_24.assignments.assignment_1;

import java.util.Scanner;

public class Task5 {
    int findTheLargest(int[] numbers) {
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            int number = numbers[i];

            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = new int[3];

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Enter a number:");
            } else {
                System.out.println("\nEnter another number:");
            }

            int userInput = scanner.nextInt();
            numberArr[i] = userInput;
        }

        Task5 task = new Task5();

        int result = task.findTheLargest(numberArr);
        System.out.format("\nLargest number: %d", result);
        scanner.close();
    }
}
