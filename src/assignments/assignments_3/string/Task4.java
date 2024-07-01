package assignments.assignments_3.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        ArrayList<String> inputWords = new ArrayList<>();

        System.out.println("Enter a word in small letters:");

        checkDuplicate: do {
            flag = false;
            String userInput = sc.next();
            
            for (String inputWord : inputWords) {
                if (inputWord.equals(userInput)) {
                    System.out.printf("%s has already been input.\nPlease enter another word.\n", userInput);
                    flag = true;
                    continue checkDuplicate;
                }
            }

            inputWords.add(userInput);

            char[] dupLetters = new char[userInput.length()];
            checkDupLetters: for (int i = 0; i < userInput.length(); i++) {
                char currentLetter = userInput.charAt(i);

                if (i != 0) {
                    for (char dupLetter : dupLetters) {
                        if (dupLetter == currentLetter) {
                            continue checkDupLetters;
                        }
                    }
                }

                int count = 1;
                for (int j = i + 1; j < userInput.length(); j++) {
                    char iteratedLetter = userInput.charAt(j);
                    if (currentLetter == iteratedLetter) {
                        count++;
                    }
                }

                if (count > 1) {
                    dupLetters[i] = currentLetter;
                    flag = true;
                    System.out.printf("\"%s\" has been counted %d times in the word \"%s\".\n", currentLetter,
                            count,
                            userInput);
                }
            }

            if (flag) {
                System.out.println("Please enter another word.");
            } else {
                System.out.printf("You entered %s.", userInput);
                sc.close();
                break;
            }
        } while (flag);
    }
}