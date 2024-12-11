package semesters_archives.fall_24.assignments.assignment_1.ungraded_tasks;

import java.util.Scanner;

public class Task3 {
    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            System.out.print(elem);

            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();

        while (N <= 0) {
            System.out.println(
                    "\nInvalid Input: The length of the array must be a positive integer!\nEnter a valid length:");
            N = sc.nextInt();
        }

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            String suffix = i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "th";

            System.out.format("\nEnter the %d%s element:\n", i + 1, suffix);
            arr[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int median;
        int medianIndex = N / 2;
        if (N % 2 == 0) {
            int medianIndex2 = medianIndex - 1;
            median = (arr[medianIndex] + arr[medianIndex2]) / 2;
            System.out.printf("\nThe median is %d.\n\n", median);

            System.out.printf("Explanation: (%d+%d)/2=%d (average of two middle values from ", arr[medianIndex2],
                    arr[medianIndex], median);
            printArr(arr);
            System.out.print(").");
        } else {
            median = arr[medianIndex];
            System.out.printf("\nThe median is %d.\n\n", median);

            System.out.printf("Explanation: %d falls in middle ", median);
            printArr(arr);
        }
    }
}
