package semesters_archives.fall_24.assignments.assignment_3.graded_tasks.task5;

public class TaxiTester {
    public static void main(String[] args) {
        TaxiLagbe taxi1 = new TaxiLagbe();
        taxi1.storeInfo("1010-01", "Dhaka");
        System.out.println("1-------------");
        taxi1.printDetails();
        System.out.println("2-------------");
        taxi1.addPassenger("Wilson", 105);
        System.out.println("3-------------");
        taxi1.printDetails();
        System.out.println("4-------------");
        taxi1.addPassenger("Walker", 100, "Wood", 200);
        System.out.println("5-------------");
        taxi1.printDetails();
        System.out.println("6-------------");
        taxi1.addPassenger("Karen", 200);
        taxi1.addPassenger("Donald", 130);
        System.out.println("7-------------");
        taxi1.printDetails();
        System.out.println("8-------------");
        TaxiLagbe taxi2 = new TaxiLagbe();
        taxi2.storeInfo("1010-02", "Khulna");
        taxi2.addPassenger("Don", 115, "Parker", 215);
        System.out.println("9-------------");
        taxi2.printDetails();
    }
}
