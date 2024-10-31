package summer_24.assignments.assignment_3.array;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();

        int[] arr = new int[N];
        int[][] elemCounts = new int[N][2];

        for (int i = 0; i < N; i++) {
            System.out.printf("\nEnter element no %d:\n", i + 1);
            arr[i] = sc.nextInt();
        }

        int countUnique = 0;

        for (int i = 0; i < N; i++) {
            int currentElem = arr[i];
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (arr[j] == currentElem) {
                    count++;
                }
            }

            boolean alreadyInput = false;
            for (int j = 0; j < countUnique; j++) {
                if (elemCounts[j][0] == currentElem) {
                    alreadyInput = true;
                    break;
                }
            }

            if (!alreadyInput) {
                elemCounts[countUnique][0] = currentElem;
                elemCounts[countUnique][1] = count;
                countUnique++;
            }
        }

        System.out.println();

        for (int i = 0; i < countUnique; i++) {
            int elem = elemCounts[i][0];
            int count = elemCounts[i][1];

            System.out.printf("%d - %d times\n", elem, count);
        }

        sc.close();
    }
}