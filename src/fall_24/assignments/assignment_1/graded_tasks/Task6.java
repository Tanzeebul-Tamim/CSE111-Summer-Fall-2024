package fall_24.assignments.assignment_1.graded_tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();

        int[] arr = new int[N];
        int[][] count = new int[N][2];

        for (int i = 0; i < N; i++) {
            String suffix = i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "th";

            System.out.format("\nEnter the %d%s element:\n", i + 1, suffix);
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            int elem = arr[i];
            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (count[j][0] == elem) {
                    count[j][1]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                count[i][0] = elem;
                count[i][1]++;
            }
        }

        System.out.println();

        for (int i = 0; i < count.length; i++) {
            if (count[i][0] != 0) {
                System.out.printf("%d - %d times\n", count[i][0], count[i][1]);
            }
        }

        sc.close();
    }
}
