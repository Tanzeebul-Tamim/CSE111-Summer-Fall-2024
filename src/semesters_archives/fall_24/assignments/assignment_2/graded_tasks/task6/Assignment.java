package semesters_archives.fall_24.assignments.assignment_2.graded_tasks.task6;

public class Assignment {
    public int tasks;
    public String difficulty;
    public boolean submission;

    public void printDetails() {
        System.out.printf("Number of tasks: %d\n", this.tasks);
        System.out.printf("Difficulty level: %s\n", this.difficulty);
        System.out.printf("Submission required: %b\n", this.submission);
    }

    public String makeOptional() {
        if (this.submission) {
            this.submission = false;
            return "Assignment will not require submission";
        } else {
            return "Submission is already not required";
        }
    }
}
