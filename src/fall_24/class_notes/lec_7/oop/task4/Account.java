package fall_24.class_notes.lec_7.oop.task4;

public class Account {
    private String name;
    private String occupation;
    private int balance;

    Account() {
        this.name = null;
        this.occupation = "Self-employed";
        this.balance = 0;
    }

    public void setUp(String name, int deposit) {
        this.name = name;
        this.balance = deposit;

        System.out.printf("Account for %s created successfully.\n", this.name);
    }

    public void setUp(String name, String occupation, int deposit) {
        this.occupation = occupation;
        setUp(name, deposit);
    }

    public void addMoney(int deposit) {
        this.balance += deposit;
    }

    public void withdrawMoney(int withdraw) {
        if (withdraw >= this.balance) {
            System.out.println("Withdraw Unsuccessful.");
        } else {
            this.balance -= withdraw;
        }
    }

    public void printDetails() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Occupation: %s\n", this.occupation);
        System.out.printf("Balance: %d\n", this.balance);
    }
}
