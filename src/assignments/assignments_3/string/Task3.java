package assignments.assignments_3.string;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userInput = sc.next();
        sc.close();

        for (int i = 0; i < userInput.length(); i++) {
            String result = "";
            for (int j = 0; j <= i; j++) {
                char letter = userInput.charAt(j);
                result += letter;
            }
            System.out.println(result);
        }
    }
}
