package semesters_archives.fall_24.assignments.assignment_3.ungraded_tasks.task5;

public class Calculator {
    public void add(int... numbers) {
        int summation = 0;

        for (int number : numbers) {
            summation += number;
        }

        System.out.println(summation);
    }

    public void multiply(int... numbers) {
        int multiplication = 1;

        for (int number : numbers) {
            multiplication *= number;
        }

        System.out.println(multiplication);
    }

    public void multiply(String string, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(string);

            if (i != number - 1) {
                System.out.print("-");
            }
        }

        System.out.println();
    }
}
