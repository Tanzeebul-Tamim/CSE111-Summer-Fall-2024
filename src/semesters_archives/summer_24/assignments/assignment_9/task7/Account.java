package semesters_archives.summer_24.assignments.assignment_9.task7;

public class Account {
    public static int count;

    private String name;
    private int age;
    private String occupation;
    private int balance;

    public Account(String name, int age, String occupation, int deposit) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.balance = deposit;
        count++;
    }

    public void addMoney(int deposit) {
        this.balance += deposit;
    }

    public void printDetails() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Age: %d\n", this.age);
        System.out.printf("Occupation: %s\n", this.occupation);
        System.out.printf("Total Amount: %d\n", this.balance);
    }

    public void withdrawMoney(int withdraw) {
        if (withdraw <= this.balance) {
            this.balance -= withdraw;
        } else {
            System.out.println("Insufficient money for withdrawal!");
        }
    }
}
