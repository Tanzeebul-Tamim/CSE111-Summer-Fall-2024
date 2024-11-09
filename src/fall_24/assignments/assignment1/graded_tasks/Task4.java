package fall_24.assignments.assignment1.graded_tasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userInput = sc.next();
        
        String result = "";
        for (int i = 0; i < userInput.length(); i++) {
            int ascii = (int) userInput.charAt(i);
            ascii += ascii == 97 ? 25 : -1;
            
            char currentChar = (char) ascii;
            result += currentChar;
        }
        
        System.out.println(result);
        sc.close();
    }
}
