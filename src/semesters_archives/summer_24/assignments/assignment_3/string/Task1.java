package semesters_archives.summer_24.assignments.assignment_3.string;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userInput = sc.next();
        sc.close();

        String result = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            char letter = userInput.charAt(i);
            result += letter;
        }

        if (userInput.equals(result)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}