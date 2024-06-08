package assignments.assignment_1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your CGPA:");
        float cgpa = scanner.nextFloat();

        System.out.println();

        System.out.println("Enter the number of credits you've completed:");
        int credits = scanner.nextInt();

        scanner.close();

        System.out.println();

        if (credits >= 30 && cgpa >= 3.8f) {
            int waiver;
            
            if (cgpa >= 3.80f && cgpa <= 3.89f) {
                waiver = 25;
            } else if (cgpa >= 3.90f && cgpa <= 3.94f) {
                waiver = 50;
            } else if (cgpa >= 3.95f && cgpa <= 3.99f) {
                waiver = 75;
            } else {
                waiver = 100;
            }

            System.out.printf("The student is eligible for a waiver of %d percent\n", waiver);
        } else {
            System.out.println("The student is not eligible for a waiver.");
        }
    }
}
