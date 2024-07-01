package assignments.assignments_3.array;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int arrLen = sc.nextInt();

        int[] arr = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            System.out.printf("\nEnter element no %d:\n", i + 1);
            arr[i] = sc.nextInt();
        }

        sc.close();

        int range = (int) arr.length / 2;
        for (int i = 0; i < range; i++) {
            int elem = arr[i];
            int reverseElem = arr[arr.length - 1 - i];

            arr[arr.length - 1 - i] = elem;
            arr[i] = reverseElem;
        }

        System.out.println();

        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }
}