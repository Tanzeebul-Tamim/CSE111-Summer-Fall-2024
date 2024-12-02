package fall_24.class_notes.class_7.array_string.task1;

import java.util.Scanner;

//! Using .compareTo() method

public class Task1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[5];
        System.out.println("Enter 5 strings:");

        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }

        for (int i = 0; i < strings.length - 1; i++) {
            String elem = strings[i];

            for (int j = i + 1; j < strings.length; j++) {
                String comparingElem = strings[j];

                if (elem.compareTo(comparingElem) > 0) {
                    strings[i] = comparingElem;
                    strings[j] = elem;
                    elem = comparingElem;
                }
            }
        }

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
