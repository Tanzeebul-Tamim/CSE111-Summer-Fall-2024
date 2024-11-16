package summer_24.assignments.assignment_7.task11;

public class PuzzleTester {
    public static void main(String[] args) {
        Puzzle p = new Puzzle(5, 8);
        Puzzle p1 = new Puzzle(8);
        p.methodA();
        System.out.println(p.methodB(7) + " " + p1.methodB(7));
    }
}

// Outputs:
/*
    10 5
    10 18
    19 19
    17 7
    15 7
    20 18
 */