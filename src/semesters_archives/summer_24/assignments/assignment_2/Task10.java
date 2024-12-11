package semesters_archives.summer_24.assignments.assignment_2;

import java.util.Scanner;

public class Task10 {
    static void noteCounter(int amount, int... notes) {
        for (int i = 0; i < notes.length; i++) {
            for (int j = i + 1; j < notes.length; j++) {
                if (notes[j] > notes[i]) {
                    int temp = notes[i];
                    notes[i] = notes[j];
                    notes[j] = temp;
                }
            }
        }

        for (int note : notes) {
            int noteCount = 0;

            for (; amount >= note; amount -= note) {
                noteCount++;
            }

            if (noteCount > 0) {
                System.out.printf("%d %d's note\n", noteCount, note);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of money:");
        int amount = sc.nextInt();

        while (amount <= 0) {
            System.out.println("\nInvalid Input: The amount must be a positive integer!\nEnter a valid amount:");
            amount = sc.nextInt();
        }

        sc.close();

        int[] availableNotes = { 1, 5, 10, 50, 100, 500 };

        noteCounter(amount, availableNotes);
    }
}