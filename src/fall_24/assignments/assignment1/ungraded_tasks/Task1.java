package fall_24.assignments.assignment1.ungraded_tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            String suffix = i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "th";

            System.out.format("\nEnter the %d%s element:\n", i + 1, suffix);
            arr[i] = sc.nextInt();
        }

        System.out.println("\nEnter the element that you want to remove:");
        int remove = sc.nextInt();
        int removeIdx = -1;
        boolean found = false;

        System.out.println("\nInput array:");

        for (int i = 0; i < N; i++) {
            int elem = arr[i];
            System.out.print(elem + " ");

            if (elem == remove) {
                found = true;
                removeIdx = i;
            }
        }

        if (found) {
            System.out.println("\nNew array:");
            int[] newArr = new int[N - 1];

            for (int i = 0; i < N - 1; i++) {
                if (i < removeIdx) {
                    newArr[i] = arr[i];
                } else {
                    newArr[i] = arr[i + 1];
                }
                System.out.print(newArr[i] + " ");
            }
        } else {
            System.out.println("\nElement not found");
        }

        sc.close();
    }
}
