package semesters_archives.summer_24.assignments.assignment_3.array;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.println("Enter an integer:");
            } else {
                System.out.println("\nEnter another integer:");
            }

            arr[i] = sc.nextInt();
        }

        sc.close();

        int[] smallestAndLocation = { 0, 0 };
        int[] largestAndLocation = { 0, 0 };
        boolean firstIteration = true;

        for (int i = 0; i < 5; i++) {
            int num = arr[i];

            if (firstIteration) {
                smallestAndLocation[0] = num;
                smallestAndLocation[1] = i;

                largestAndLocation[0] = num;
                largestAndLocation[1] = i;

                firstIteration = false;
            } else {
                if (num < smallestAndLocation[0]) {
                    smallestAndLocation[0] = num;
                    smallestAndLocation[1] = i;
                }

                if (num > largestAndLocation[0]) {
                    largestAndLocation[0] = num;
                    largestAndLocation[1] = i;
                }
            }
        }

        System.out.printf("\nThe largest number %d was found at location %d.\n", largestAndLocation[0],
                largestAndLocation[1]);
        System.out.printf("The smallest number %d was found at location %d.\n", smallestAndLocation[0],
                smallestAndLocation[1]);
    }
}