package assignments.assignment_3.array;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("\nPlease enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int writeIndex = 1;

        for (int i = 1; i < N; i++) {
            int elem = arr[i];
            if (elem != arr[i - 1]) {
                arr[writeIndex] = arr[i];
                writeIndex++;
            } else {
                count++;
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