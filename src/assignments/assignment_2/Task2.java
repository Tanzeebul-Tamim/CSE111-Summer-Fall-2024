package assignments.assignment_2;

public class Task2 {
    public static void main(String[] args) {
        int elem = 2;
        boolean ascending = true;

        while (true) {
            System.out.print(elem);

            if (!ascending && elem == 2) {
                break;
            }

            System.out.print(", ");

            if (ascending) {
                elem += 2;

                if (elem > 20) {
                    ascending = false;
                    elem -= 4;
                }
            } else {
                elem -= 2;
            }
        }
    }
}
