package semesters_archives.summer_24.assignments.assignment_5.task8;

public class AppTester {
    public static void main(String args[]) {

        UberApp account1 = new UberApp();
        UberApp account2 = new UberApp();

        account1.createProfile("Jonas Kahnwald", 24, "017111111111");
        account2.createProfile("Martha Nielsen", 28, "018111111111");

        account1.showProfile();
        System.out.println("===== 1 ====");
        System.out.println("You have " + account1.remainingRides() + " ride(s) remaining.");

        System.out.println("==== 2 ====");
        account2.showProfile();
        System.out.println("You have " + account2.remainingRides() + " ride(s) remaining.");

        System.out.println("==== 3 ====");
        account1.bookRide("Merul Badda", 12.0);

        System.out.println("==== 4 ====");
        account1.bookRide("Dhanmondi 27", 4.3);
        account1.changeLocation("Wari", 5.6);

        System.out.println("==== 5 ====");
        account1.ridingHistory();

        System.out.println("==== 6 ====");
        account2.ridingHistory();

        System.out.println("==== 7 ====");
        account1.bookRide("Banani 11", 6.8);
        account1.bookRide("Gulshan 1", 2.1);

        System.out.println("==== 8 ====");
        account1.resetMonth();
        account1.bookRide("Gulshan 1", 2.1);
        account1.ridingHistory();
        System.out.println("You have " + account1.remainingRides() + " ride(s) remaining.");
    }
}
