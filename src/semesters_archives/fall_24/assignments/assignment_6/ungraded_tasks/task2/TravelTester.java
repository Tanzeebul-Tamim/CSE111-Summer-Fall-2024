package semesters_archives.fall_24.assignments.assignment_6.ungraded_tasks.task2;

public class TravelTester {
    public static void main(String[] args) {
        System.out.println("No. of Traveller = " + Travel.getCount());
        System.out.println("1================");

        Travel t1 = new Travel("Dhaka", "India");
        System.out.println(t1.displayTravelInfo());
        System.out.println("2================");

        Travel t2 = new Travel("Kuala Lampur", "Dhaka");
        t2.setTime(23);
        System.out.println(t2.displayTravelInfo());
        System.out.println("3================");

        Travel t3 = new Travel("Dhaka", "New_Zealand");
        t3.setTime(15);
        t3.setDestination("Germany");
        System.out.println(t3.displayTravelInfo());
        System.out.println("4================");

        Travel t4 = new Travel("Dhaka", "India");
        t4.setTime(9);
        t4.setSource("Malaysia");
        t4.setDestination("Canada");
        System.out.println(t4.displayTravelInfo());
        System.out.println("5================");

        System.out.println("No. of Traveller = " + Travel.getCount());
    }
}
