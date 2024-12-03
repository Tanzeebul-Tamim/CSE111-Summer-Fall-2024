package fall_24.assignments.assignment_3.ungraded_tasks.task1;

public class MoneyTracker {
    private String name;
    private float balance;
    private float lastAdded;
    private float lastSpent;

    public void createTracker(String name) {
        this.name = name;
        this.balance = 1;
    }

    public String info() {
        String name = "Name: " + this.name;
        String balance = "Current Balance: " + this.balance;
        String result = name + "\n" + balance;
        return result;
    }

    public void income(float amount) {
        this.balance += amount;
        this.lastAdded = amount;
        System.out.println("Balance Updated!");
    }

    public void expense(float amount) {
        if (this.balance < amount) {
            System.out.println("Not enough balance.");
        } else if (this.balance == amount) {
            System.out.println("You're broke!");
        } else {
            this.balance -= amount;
            this.lastSpent = amount;
            System.out.println("Balance Updated.");
        }
    }

    public void showHistory() {
        System.out.format("Last added: %.1f\n", this.lastAdded);
        System.out.format("Last spent: %.1f\n", this.lastSpent);
    }
}
