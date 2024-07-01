package practice_or_rough_works;

import java.util.Scanner;

public class Cashier {
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
            int noteCount = amount / note;
            amount = amount % note;

            if (noteCount > 0) {
                if (note <= 5) {
                    System.out.printf("%d taka coin: %d\n", note, noteCount);
                } else {
                    System.out.printf("%d taka note: %d\n", note, noteCount);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount the customer need to pay(Taka)");
        int bill = sc.nextInt();

        while (bill <= 0) {
            System.out
                    .println("\nInvalid Input: The amount of bill must be a positive integer!\nEnter a valid amount:");
            bill = sc.nextInt();
        }

        System.out.println("Enter the amount, customer gave(Taka)");
        int amount = sc.nextInt();

        while (amount <= 0) {
            System.out.println("\nInvalid Input: The amount must be a positive integer!\nEnter a valid amount:");
            amount = sc.nextInt();
        }

        sc.close();

        int[] availableNotes = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 1000 };
        int returnedAmount = amount - bill;

        if (amount < bill) {
            int due = bill - amount;
            System.out.printf("\nPlease pay %d taka more.", due);
        } else {
            System.out.printf("\nThe returned amount is %d taka.\n", returnedAmount);
            if (amount != bill) {
                noteCounter(returnedAmount, availableNotes);
            }
        }
    }
}
