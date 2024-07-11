package assignments.assignment_5.task4;

public class MoneyTracker {
  private String name = null;
  private float balance = 0;
  private float lastAdded = 0;
  private float lastSpent = 0;

  public void createTracker(String name) {
    this.name = name;
    this.balance = 1;
  }

  public String info() {
    String nameString = "Name: " + name;
    String currentBalance = "Current Balance: " + balance;
    String result = nameString + "\n" + currentBalance;
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
