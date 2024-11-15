package fall_24.class_notes.lec_7.array_string;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a floating number (three decimal precision): ");
        float input = sc.nextFloat();

        String stringConversion = input + "";
        String integer = "";
        String decimal = "";

        boolean decimalCrossed = false;
        for (int i = 0; i < stringConversion.length(); i++) {
            char character = stringConversion.charAt(i);

            if (character == '.') {
                decimalCrossed = true;
            } else if (decimalCrossed) {
                decimal += character;
            } else {
                integer += character;
            }
        }

        System.out.println(integer);
        System.out.println(decimal);

        sc.close();
    }
}
