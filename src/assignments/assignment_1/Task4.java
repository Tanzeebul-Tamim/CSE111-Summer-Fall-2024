package assignments.assignment_1;

public class Task4 {
    void multiplicationTable(int n, int numberOfMultiplicands) {
        if (numberOfMultiplicands < 1) {
            return;
        }

        multiplicationTable(n, numberOfMultiplicands - 1);

        int product = n * numberOfMultiplicands;
        System.out.printf("%d x %d = %d\n", n, numberOfMultiplicands, product);
    }

    public static void main(String[] args) {
        Task4 task = new Task4();

        int n = 5;
        task.multiplicationTable(n, 10);
    }
}
