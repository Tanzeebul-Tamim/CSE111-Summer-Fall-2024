package summer_24.assignments.assignment_6.task1;

public class Assignment {
    int tasks;
    String difficulty;
    boolean submission;

    Assignment() {
        tasks = 0;
        difficulty = null;
        submission = false;
    }

    void printDetails() {
        System.out.printf("Number of tasks: %d\n", tasks);
        System.out.printf("Difficulty level: %s\n", difficulty);
        System.out.printf("Submission required: %b\n", submission);
    }

    void makeOptional() {
        if (submission == true) {
            submission = false;
            System.out.println("Assignment will not require submission");
        } else {
            System.out.println("Submission is already not required");
        }
    }
}
