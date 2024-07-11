package practice_or_rough_works;

import java.util.Scanner;

/*
    You need to write a Java program to simulate a cashier system that calculates and outputs the number of each denomination of notes and coins required to give the correct change. The program will take an input for the total bill amount and the amount given by the customer. If the amount given is less than the bill, the program will output the additional amount required. If the amount given is more than or equal to the bill, the program will output the change to be returned in the form of notes and coins.

    Sample Input 1:
    Enter the amount the customer needs to pay (Taka):
    150
    Enter the amount the customer gave (Taka):
    1000

    Sample Output 1:
    The returned amount is 850 taka.
    500 taka note: 1
    200 taka note: 1
    100 taka note: 1
    50 taka note: 1

    Explanation 1:
    The customer gives 1000 Taka for a bill of 150 Taka, requiring the cashier to return 850 Taka. The program calculates the denominations required, sorted in descending order, and outputs the number of each note and coin needed.

    Sample Input 2:
    Enter the amount the customer needs to pay (Taka):
    750
    Enter the amount the customer gave (Taka):
    500

    Sample Output 2:
    Please pay 250 taka more.

    Explanation 2:
    The customer gives 500 Taka for a bill of 750 Taka, so the program informs the customer that 250 Taka more is needed.
*/

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
            System.out.printf("\nPlease pay %d taka more.\n", due);
        } else {
            System.out.printf("\nThe returned amount is %d taka.\n", returnedAmount);
            if (amount != bill) {
                noteCounter(returnedAmount, availableNotes);
            }
        }
    }
}
