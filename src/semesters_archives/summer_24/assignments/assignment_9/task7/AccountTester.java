package semesters_archives.summer_24.assignments.assignment_9.task7;

public class AccountTester {
    public static void main(String[] args) {
        System.out.println("Total account holders: " + Account.count);
        System.out.println("1================");
        Account p1 = new Account("Abdul", 45, "Service Holder", 500000);
        p1.addMoney(300000);
        p1.printDetails();
        System.out.println("2================");
        Account p2 = new Account("Rahim", 55, "Businessman", 700000);
        p2.withdrawMoney(700000);
        p2.printDetails();
        System.out.println("3================");
        Account p3 = new Account("Ashraf", 62, "Govt.Officer", 200000);
        p3.withdrawMoney(250000);
        p3.printDetails();
        System.out.println("4================");
        System.out.println("Total account holders: " + Account.count);

    }
}
