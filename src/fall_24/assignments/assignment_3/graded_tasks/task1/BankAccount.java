package fall_24.assignments.assignment_3.graded_tasks.task1;

public class BankAccount {
    private int accountNo;
    private String type;

    public BankAccount() {
        this.type = "Not Set";
    }

    public String printDetails() {
        String accNo = "Account No: " + this.accountNo;
        String accType = "Type: " + this.type;
        String output = accNo + "\n" + accType;

        return output;
    }

    public void setInfo(int accountNo, String type) {
        this.accountNo = accountNo;
        this.type = type;

        System.out.println("Account information updated!");
    }
}
