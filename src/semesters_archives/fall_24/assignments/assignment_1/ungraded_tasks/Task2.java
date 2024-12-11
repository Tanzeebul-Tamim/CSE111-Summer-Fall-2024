package semesters_archives.fall_24.assignments.assignment_1.ungraded_tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers:");

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            String suffix = i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "th";

            System.out.format("\nEnter the %d%s element:\n", i + 1, suffix);
            arr[i] = sc.nextInt();
        }

        int min = -1, max = -1, minLoc = -1, maxLoc = -1;

        for (int i = 0; i < 5; i++) {
            int elem = arr[i];

            if (i == 0) {
                min = elem;
                max = elem;
                minLoc = i;
                maxLoc = i;
            } else {
                if (elem < min) {
                    min = elem;
                    minLoc = i;
                }

                if (elem > max) {
                    max = elem;
                    maxLoc = i;
                }
            }
        }

        System.out.printf("\nThe largest number %d was found at location %d.\n", max, maxLoc);
        System.out.printf("The smallest number %d was found at location %d.\n", min, minLoc);

        sc.close();
    }
}
