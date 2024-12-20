package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task2;

public class PassengerTester {
    public static void main(String args[]) {
        System.out.println("Total Passenger: " + Passenger.no_of_passenger);
        System.out.println("Total Fare: " + Passenger.total_fare + " TK");
        System.out.println("==========1==========");
        Passenger p1 = new Passenger("Lara", 5.6);
        p1.passengerDetails();
        System.out.println("==========2==========");
        Passenger p2 = new Passenger("Kevin", 10.0);
        p2.storeBaggageWeight(6.8);
        p2.passengerDetails();
        System.out.println("==========3==========");
        Passenger p3 = new Passenger("Robin", 2.3);
        p3.storeBaggageWeight(5.0);
        p3.passengerDetails();
        System.out.println("==========4==========");
        System.out.println("Total Passenger: " + Passenger.no_of_passenger);
        System.out.println("Total Fare: " + Passenger.total_fare + " TK");
    }
}
