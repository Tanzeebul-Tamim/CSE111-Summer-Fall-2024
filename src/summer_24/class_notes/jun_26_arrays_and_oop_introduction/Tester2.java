package summer_24.class_notes.jun_26_arrays_and_oop_introduction;

import java.util.Arrays;

public class Tester2 {
    public static void main(String[] args) {
        String[][] database = new String[3][2];
        // 3 rows/customers, 2 data per customers (name and email)
        for (int i = 0; i < database.length; i++) {
            database[i][0] = "Name-" + (i + 1);
            database[i][1] = "Email-" + (i + 1);
        }
        System.out.println("Full Database:");
        for (int i = 0; i < database.length; i++)
            System.out.println(Arrays.toString(database[i]));

        String[] customer = database[2];
        System.out.println("First Customer:");
        System.out.println(Arrays.toString(customer));

    }
}
