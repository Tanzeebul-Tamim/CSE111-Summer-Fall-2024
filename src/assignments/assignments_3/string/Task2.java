package assignments.assignments_3.string;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userInput = sc.next();
        sc.close();

        String result = "";
        for (int i = 0; i < userInput.length(); i++) {
            int ascii = (int) userInput.charAt(i);

            if (ascii == 65 || ascii == 97) {
                ascii += 25;
            } else {
                ascii -= 1;
            }

            char currentChar = (char) ascii;
            result += currentChar;
        }

        System.out.println(result);
    }
}