package fall_24.class_notes.class_7.array_string.task1;

import java.util.Scanner;

//! Without .compareTo() or any other built in methods

public class Task1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[5];
        System.out.println("Enter 5 strings:");

        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }

        for (int i = 0; i < strings.length - 1; i++) {
            String elem = strings[i];

            // Iterating through the rest of the elements and comparing them with the
            // current element
            for (int j = i + 1; j < strings.length; j++) {
                String comparingElem = strings[j];

                /*
                 * Determine the range for character comparison by finding the length of the
                 * shorter string
                 */
                int length1 = elem.length();
                int length2 = comparingElem.length();
                int range = (length1 < length2) ? length1 : length2;

                boolean swapped = false;

                // Comparing each character
                for (int k = 0; k < range; k++) {
                    char elemLetter = elem.charAt(k);
                    char comparingElemLetter = comparingElem.charAt(k);

                    /*
                     * Comparing the ASCII values of the letters from both strings at the same
                     * position
                     */
                    int elemAscii = (int) elemLetter;
                    int comparingElemAscii = (int) comparingElemLetter;

                    /*
                     * Swap the positions of the two strings being compared if the current character
                     * of the earlier string in the array comes after the current character of the
                     * latter string
                     */
                    if (elemAscii > comparingElemAscii) {
                        strings[i] = comparingElem;
                        strings[j] = elem;
                        elem = comparingElem;
                        swapped = true;
                        break;
                    }

                    /*
                     * If the current character of the latter string in the array comes after the
                     * current character of the previous string, terminate the loop
                     */
                    else if (elemAscii < comparingElemAscii) {
                        break;
                    }

                    /*
                     * If the current character of both strings are same, continue the loop looking
                     * for distinctions
                     */
                    else {
                        continue;
                    }
                }

                /*
                 * Ensures the shorter string comes before the longer one if all compared
                 * characters are identical
                 */
                if (!swapped && length1 > length2) {
                    strings[i] = comparingElem;
                    strings[j] = elem;
                }
            }
        }

        // Printing the final outputs
        int i = 0;
        for (String string : strings) {
            System.out.print(string);

            if (i != strings.length - 1) {
                System.out.print(", ");
                i++;
            }
        }

        sc.close();
    }
}