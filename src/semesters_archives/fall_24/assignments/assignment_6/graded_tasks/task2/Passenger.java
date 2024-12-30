package semesters_archives.fall_24.assignments.assignment_6.graded_tasks.task2;

public class Passenger {
    protected static int no_of_passenger;
    protected static double total_fare;

    private String name;
    private double distance;
    private double baggage;
    private double fare;

    protected Passenger(String name, double distance) {
        this.name = name;
        this.distance = distance;
        this.fare = calculateFare(this.distance);
        total_fare += this.fare;
        no_of_passenger++;
    }

    protected void storeBaggageWeight(double baggage) {
        total_fare -= this.fare;
        this.baggage = baggage;
        this.fare = calculateFare(this.distance, this.baggage);
        total_fare += this.fare;
    }

    private double calculateFare(double distance) {
        return calculateFare(distance, 0);
    }

    private double calculateFare(double distance, double baggage) {
        return distance * 20 + baggage * 10;
    }

    protected void passengerDetails() {
        System.out.printf("Name: %s\n", this.name);
        System.out.printf("Fare: %.1f TK\n", this.fare);
    }
}
