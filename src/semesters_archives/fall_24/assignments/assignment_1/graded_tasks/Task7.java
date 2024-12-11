package semesters_archives.fall_24.assignments.assignment_1.graded_tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();

        double[] arr = new double[N];

        System.out.println("\nPlease enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }

        int count = 0;
        int writeIndex = 1;

        for (int i = 1; i < N; i++) {
            double elem = arr[i];

            if (elem == arr[i - 1]) {
                count++;
            } else {
                arr[writeIndex] = arr[i];
                writeIndex++;
            }
        }

        System.out.print("\nNew Array:");

        for (int i = 0; i < writeIndex; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nRemoved elements: " + count);
        sc.close();
    }
}