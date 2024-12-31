package semesters_archives.fall_24.assignments.assignment_7.graded_tasks.task2;

public class CheckingAccount extends Account {
    public static int count;

    public CheckingAccount() {
        this(count);
    }

    public CheckingAccount(double balance) {
        super(balance);
        count++;
    }
}
