package random_solves;

public class SquareSequence {
    public static void main(String[] args) {
        int start = 1, stop = 5, update = 1;

        // Loop to print the squares of numbers from start to stop using while loop
        while (start <= stop) {
            System.out.print((start * start) + " ");
            start += update;
        }
        System.out.println();

        // Loop to print the squares of numbers from start to stop using for loop (without using the multiplication operator)
        /*
          Explanation:
          A for loop can contain three parts separated by semicolons.
          - In the first part, you can initialize some variables (usually the start
            point).
          - In the second part, you specify the stop condition.
          - In the third part, you can update the variables initialized in the first
          part.
          
          In this example:
          - The first part initializes three variables.
          - The second part contains the stop condition.
          - The third part updates the 'start' variable (which tracks the current
          value) and
          also updates the 'update' variable by 2 in each iteration.
          
          Why update the 'update' variable as well?
          The differences between consecutive squares increase by 2 each time:
            4 - 1 = 3
            9 - 4 = 5 = (3 + 2)
            16 - 9 = 7 = (5 + 2)
            25 - 16 = 9 = (7 + 2)
          
          Thus, the 'update' variable is increased by 2 in each iteration.
         */
        for (start = 1, stop = 25, update = 3; start <= stop; start += update, update += 2) {
            System.out.print(start + " ");
        }
        System.out.println();
    }
}
