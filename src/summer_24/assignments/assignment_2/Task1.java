package summer_24.assignments.assignment_2;

public class Task1 {
    public static void main(String[] args) {
        // TASK A
        System.out.println("TASK A");

        int element = 2;
        while (element <= 50) {
            System.out.print(element);

            if (element != 50) {
                System.out.print(", ");
            }

            element += 4;
        }

        System.out.println();

        // TASK B
        System.out.println("\nTASK B");

        int elem = 1;
        int incrementBy = 2;
        while (elem <= 120) {
            System.out.print(elem);

            if (elem != 120) {
                System.out.print(", ");
            }

            elem += incrementBy;
            incrementBy ++;
        }

        System.out.println();
    }
}