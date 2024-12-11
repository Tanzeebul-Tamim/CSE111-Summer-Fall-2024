package semesters_archives.summer_24.assignments.assignment_6.task1;

public class Assignment {
    public int tasks;
    public String difficulty;
    public boolean submission;

    public void printDetails() {
        System.out.printf("Number of tasks: %d\n", tasks);
        System.out.printf("Difficulty level: %s\n", difficulty);
        System.out.printf("Submission required: %b\n", submission);
    }

    public void makeOptional() {
        if (submission == true) {
            submission = false;
            System.out.println("Assignment will not require submission");
        } else {
            System.out.println("Submission is already not required");
        }
    }
}
