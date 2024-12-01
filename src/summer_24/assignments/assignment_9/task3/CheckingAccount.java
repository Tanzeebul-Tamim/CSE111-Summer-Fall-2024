package summer_24.assignments.assignment_9.task3;

public class CheckingAccount extends Account {
    public static int count;

    public CheckingAccount() {
        super(0);
        count++;
    }

    public CheckingAccount(double balance) {
        super(balance);
        count++;
    }
}
