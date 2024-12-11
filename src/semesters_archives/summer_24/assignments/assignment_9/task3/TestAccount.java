package semesters_archives.summer_24.assignments.assignment_9.task3;

public class TestAccount {
    public static void main(String[] args) {
        System.out.println("Total Checking Accounts: " + CheckingAccount.count);
        CheckingAccount c1 = new CheckingAccount();
        System.out.println("Account Balance: " + c1.showBalance());
        CheckingAccount c2 = new CheckingAccount(100.0);
        System.out.println("Account Balance: " + c2.showBalance());
        CheckingAccount c3 = new CheckingAccount(200.0);
        System.out.println("Account Balance: " + c3.showBalance());
        System.out.println("Total Checking Accounts: " + CheckingAccount.count);
    }
}
