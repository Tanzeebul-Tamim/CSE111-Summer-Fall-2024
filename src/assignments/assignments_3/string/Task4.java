package assignments.assignments_3.string;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean dupFound = false;

        System.out.println("Enter a word in small letters:");

        do {
            dupFound = false;
            String userInput = sc.next();

            int ascii = 0;
            for (int i = 0; i < userInput.length(); i++) {
                char currentLetter = userInput.charAt(i);
                if (i != 0 && ascii == (int) currentLetter) {
                    System.out.println("prev " + ascii);
                    System.out.println("curr " + (int) currentLetter);
                    continue;
                }

                ascii = (int) currentLetter;

                int count = 1;
                for (int j = i + 1; j < userInput.length(); j++) {
                    char iteratedLetter = userInput.charAt(j);
                    if (currentLetter == iteratedLetter) {
                        count++;
                    }
                }

                if (count > 1) {
                    dupFound = true;
                    System.out.printf("\"%s\" has been counted %d times in the word \"%s\".\n", currentLetter,
                            count,
                            userInput);
                }
            }

            if (dupFound) {
                System.out.println("Please enter another word.");
            } else {
                System.out.printf("You entered %s", userInput);
                sc.close();
                break;
            }
        } while (dupFound);
    }
}
