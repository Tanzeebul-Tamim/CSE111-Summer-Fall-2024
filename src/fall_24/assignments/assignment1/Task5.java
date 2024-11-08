package fall_24.assignments.assignment1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 1; i <= N; i++) {
            String suffix = i == 1 ? "st" : i == 2 ? "nd" : i == 3 ? "rd" : "th";

            System.out.format("\nEnter the %d%s element:\n", i, suffix);
            arr[i - 1] = sc.nextInt();
        }
        
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

        sc.close();
    }
}
